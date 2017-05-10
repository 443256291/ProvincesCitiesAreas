package com.gs.base.controller;


import com.github.pagehelper.util.StringUtil;
import com.gs.base.model.BgLoginPOJO;
import com.gs.base.model.BgPermissionPOJO;
import com.gs.base.service.impl.*;
import com.gs.base.util.MyUUIDUtil;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.UnauthorizedException;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.ByteSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * Created by GaoShan on 2017/3/9.
 */
@Controller
@RequestMapping("/admin")
public class BgLoginController {


    @Resource
    private BgLoginServiceImpl bgLoginService;

    @Resource
    private BgPermissionServiceImpl bgPermissionService;

    @Resource
    private BgRolePermissionServiceImpl bgRolePermissionService;

    @Resource
    private BgRoleServiceImpl bgRoleService;

    @Resource
    private BgUserRoleServiceImpl bgUserRoleService;

    @Resource
    private BgUserServiceImpl bgUserService;


    @RequestMapping("/insertPermission")
    public void insertPermission() {
        BgPermissionPOJO bgPermissionPOJO = new BgPermissionPOJO();
        bgPermissionPOJO.setId(MyUUIDUtil.getUUID());
        bgPermissionPOJO.setPermission_name("admin");
        int i = bgPermissionService.insertPOJO(bgPermissionPOJO);

        System.out.println(i);
    }


    @RequestMapping("/bg_login")
    public String bg_login() {
        return "view/bg/bg_login";
    }

    @RequestMapping("/bg_article_add")
    public String bg_article_add() {
        return "view/bg_article_add";
    }


    /**
     * //todo zaizheli xie
     *
     * @param request
     * @param model
     * @return
     */
//    @RequestMapping(value = "/login.do",method = RequestMethod.POST)
    public String login(HttpServletRequest request, Model model) {
        String msg = "";
        BgLoginPOJO bgLoginPOJO = new BgLoginPOJO();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if (StringUtil.isNotEmpty(username)) {
            bgLoginPOJO.setUsername(username);
        }
        if (StringUtil.isNotEmpty(password)) {
            password = new SimpleHash("md5", password,
                    ByteSource.Util.bytes(bgLoginPOJO.getUsername()), 2).toHex();
            bgLoginPOJO.setPassword(password);
        }
        //根据验证账号密码
        BgLoginPOJO bgLoginPOJO1 = bgLoginService.selectPOJO(bgLoginPOJO);
        if (bgLoginPOJO1 == null) {
            return null;
        }


        SecurityUtils.getSecurityManager().logout(SecurityUtils.getSubject());
        // 登录后存放进shiro token

        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        token.setRememberMe(true);
        Subject subject = SecurityUtils.getSubject();
        subject.login(token); // 登陆
        try {
            subject.login(token);
            if (subject.isAuthenticated()) {
                return "redirect:/";
            } else {
                return "bg_login";
            }
        } catch (IncorrectCredentialsException e) {
            msg = "登录密码错误. Password for account " + token.getPrincipal() + " was incorrect.";
            model.addAttribute("message", msg);
            System.out.println(msg);
        } catch (ExcessiveAttemptsException e) {
            msg = "登录失败次数过多";
            model.addAttribute("message", msg);
            System.out.println(msg);
        } catch (LockedAccountException e) {
            msg = "帐号已被锁定. The account for username " + token.getPrincipal() + " was locked.";
            model.addAttribute("message", msg);
            System.out.println(msg);
        } catch (DisabledAccountException e) {
            msg = "帐号已被禁用. The account for username " + token.getPrincipal() + " was disabled.";
            model.addAttribute("message", msg);
            System.out.println(msg);
        } catch (ExpiredCredentialsException e) {
            msg = "帐号已过期. the account for username " + token.getPrincipal() + "  was expired.";
            model.addAttribute("message", msg);
            System.out.println(msg);
        } catch (UnknownAccountException e) {
            msg = "帐号不存在. There is no user with username of " + token.getPrincipal();
            model.addAttribute("message", msg);
            System.out.println(msg);
        } catch (UnauthorizedException e) {
            msg = "您没有得到相应的授权！" + e.getMessage();
            model.addAttribute("message", msg);
            System.out.println(msg);
        }
        return "login";

    }



    /**
     * /admin/insert
     */
    @RequestMapping(value = "/insert")
    @ResponseBody
    public void insert() {
        BgLoginPOJO bgLoginPOJO = new BgLoginPOJO();

        String uuid = MyUUIDUtil.getUUID();
        bgLoginPOJO.setId(uuid);
        bgLoginPOJO.setCreate_by("GS");
        bgLoginPOJO.setCreate_time(new Date());
        bgLoginPOJO.setModify_by("GS");
        bgLoginPOJO.setModify_time(new Date());
        bgLoginPOJO.setStatus("1");//1表示激活 0 表示锁定
        bgLoginPOJO.setAvailable("1");//1表示可见 0表示不可见
        bgLoginPOJO.setUsername("admin");
        bgLoginPOJO.setPassword("myfgw100527");
//        6939662cec61bb32d49143cfcfa885c9
        //password加密 生成新的passwrod 与UserRealm配套
        String newPassword = new SimpleHash("md5", bgLoginPOJO.getPassword(),
                ByteSource.Util.bytes(bgLoginPOJO.getUsername()), 2).toHex();

        bgLoginPOJO.setPassword(newPassword);

        int i = bgLoginService.insertPOJO(bgLoginPOJO);
//        System.out.println(i);

    }

    @RequestMapping(value = "/update")
    @ResponseBody
    public void update(HttpServletRequest request) {
        BgLoginPOJO bgLoginPOJO = new BgLoginPOJO();

    }

    @RequestMapping(value = "/selectList")
    @ResponseBody
    public List<BgLoginPOJO> select() {
        List<BgLoginPOJO> bgLoginPOJOS = bgLoginService.selectPOJOList();
        return bgLoginPOJOS;
    }

    /**
     * 登陆页面
     *
     * @param username
     * @param password
     * @return
     */
    @RequestMapping(value = "/login.do", method = RequestMethod.POST)
    @ResponseBody
    public HashMap login(HttpServletRequest request, @RequestParam("username") String username, @RequestParam("password") String password) {
        HashMap<String, Object> map = new HashMap<>();
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        Subject subject = SecurityUtils.getSubject();
        try {
            subject.login(token);
        } catch (IncorrectCredentialsException ice) {
            request.setAttribute("message", "password error!");
            map.put("message", "password error!");
            return map;
        } catch (UnknownAccountException uae) {
            request.setAttribute("message", "username error!");
            map.put("message", "username error!");
            return map;

        } catch (ExcessiveAttemptsException eae) {
            request.setAttribute("message", "times error");
            map.put("message", "times error");
            return map;
        }
        BgLoginPOJO bgLoginPOJO = new BgLoginPOJO();
        bgLoginPOJO.setUsername(username);
        bgLoginPOJO = bgLoginService.selectPOJO(bgLoginPOJO);

        subject.getSession().setAttribute("bgLoginPOJO", bgLoginPOJO);
        request.setAttribute("message", "success");
        map.put("message","success");
        map.put("username",bgLoginPOJO.getUsername());

        request.setAttribute("login_count",bgLoginPOJO.getPrepare1());
        request.setAttribute("last_login_ip",bgLoginPOJO.getPrepare2());
        request.setAttribute("last_login_tiem",bgLoginPOJO.getModify_time());

        //获取本次登陆id
        request.getRemoteAddr();
        String getIP = null;
        if (request.getHeader("x-forwarded-for") == null) {
            getIP = request.getRemoteAddr();
        } else
            getIP = request.getHeader("x-forwarded-for");
        //记录登陆次数 存储放在prepare1中
        bgLoginPOJO.setPrepare1(""+(Integer.parseInt(bgLoginPOJO.getPrepare1())+1));
        //登录ip存放在 prepare2种
        bgLoginPOJO.setPrepare2(getIP);
        bgLoginPOJO.setModify_time(new Date());//本次登陆时间
        bgLoginService.updatePOJO(bgLoginPOJO);
        return map;

    }

    /**
     * 退出登录
     *
     * @return
     */
    @RequestMapping(value = "/logout.do")
    public String logout() {
        Subject currentUser = SecurityUtils.getSubject();
        if (SecurityUtils.getSubject().getSession() != null) {
            currentUser.logout();
        }
        return "redirect:/bg/bg_login";
    }
}
