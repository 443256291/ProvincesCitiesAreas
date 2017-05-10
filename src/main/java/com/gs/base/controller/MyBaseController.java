package com.gs.base.controller;

import com.gs.base.model.BaseModel;
import com.gs.base.service.BaseService;
import com.gs.base.service.impl.BaseServiceImpl;
import com.gs.base.util.MyMapUtils;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

/**
 * Created by GaoShan on 2017/4/26.
 */
@Controller
public class MyBaseController {

    /**
     * 不存在返回true
     * @param request
     * @param service
     * @param baseModel
     * @return
     */
    public boolean checkIsNotExist(HttpServletRequest request , BaseService service ,BaseModel baseModel){
        Object o = service.selectPOJO(baseModel);
        if(o!=null){
            return true;
        }
        return false;
    }

    public HashMap insertPOJO(HttpServletRequest request , BaseService service,BaseModel baseModel ){
        int i = service.insertPOJO(baseModel);
        return MyMapUtils.getMapForReturnMsg(i);
    }

    /**
     * 更新实体模型
     * @param request
     * @param service
     * @param baseModel
     * @return
     */
    public HashMap updatePOJO(HttpServletRequest request , BaseService service,BaseModel baseModel ){
        int i = service.updatePOJO(baseModel);
        return MyMapUtils.getMapForReturnMsg(i);
    }

    /**
     * 删除一个实体模型
     * @param request 存放id的request
     * @param service 要用到的表
     * @return
     */
    public HashMap deletePOJO(HttpServletRequest request , BaseService service){
        BaseModel baseModel  = new BaseModel();
        baseModel.setId(request.getParameter("id"));
        int i = service.deletePOJO(baseModel);
        return MyMapUtils.getMapForReturnMsg(i);

    }


    /**
     * 获取一个实体模型
     * @param request
     * @param service
     * @return
     */
    public HashMap selectOnePOJO(HttpServletRequest request ,BaseService service){
        BaseModel baseModel  = new BaseModel();
        baseModel.setId(request.getParameter("id"));
        Object o = service.selectPOJO(baseModel);
        return MyMapUtils.getMapForSelectOne(o);
    }

    /**
     * 无条件获取实体模型集合
     * @param request
     * @param service
     * @param baseModel
     * @return
     */
    public HashMap selectListPOJO(HttpServletRequest request ,BaseService service, BaseModel baseModel){
        List list = service.selectPOJOList(baseModel);
        return MyMapUtils.getMapForSelectOne(list);
    }

    /**
     * 有条件获取实体模型集合
     * @param service
     * @return
     */
    public HashMap selectListPOJO(BaseService service){
        List list = service.selectPOJOList();
        return MyMapUtils.getMapForSelectOne(list);
    }

   /* public void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        BufferedImage image=new BufferedImage(100, 30, BufferedImage.TYPE_INT_RGB);
        Graphics g=image.getGraphics();
        Random r=new Random();
        g.setColor(new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255)));
        g.fillRect(0, 0, 100, 30);
        g.setColor(new Color(255,255,255));
        g.setFont(new Font(null,Font.BOLD,24));
        String code=getCode();
        HttpSession session=request.getSession();
        session.setAttribute("textcode", code);

        g.drawString(code, 10, 25);
        response.setContentType("image/jpeg");
        OutputStream os=response.getOutputStream();
        ImageIO.write(image, "jpeg", os);
        os.close();
    }

    *//**
     * 随机生成验证码字符串的类
     * @return
     *//*
    public static String getCode(){
        char[] letters={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t',
                'u','v','w','x','y','z'};
        String code="";
        boolean[] bool=new boolean[letters.length];

        for(int i=0;i<5;i++){
            int num ;
            do{
                num=(int)(Math.random()*(letters.length));
            }while(bool[num]);
            code+=letters[num];
            bool[num]=true;
        }
        return code.toUpperCase();
    }*/
}
