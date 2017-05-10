package com.gs.base.controller;

import com.baidu.ueditor.ActionEnter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by GaoShan on 2017/4/7.
 * Description:如此坑爹的UEditor我已经不想表达什么了
 * 修改1:config.json --> "imageUrlPrefix": "/MYFGW",  图片访问路径前缀  如果有项目名要增加前缀
 * 修改2:ueditor.config.js  -->   serverUrl: "/MYFGW/ue/config"
 */
@Controller
@RequestMapping(value = "/ue")
public class UeditorController {

    @RequestMapping("/config")
    public void config(HttpServletRequest request, HttpServletResponse response, String action) {
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        String rootPath = request.getSession().getServletContext().getRealPath("/");
        System.out.println(rootPath);
        try {
            String exec = new ActionEnter(request, rootPath).exec();
            PrintWriter writer = response.getWriter();
            writer.write(exec);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}