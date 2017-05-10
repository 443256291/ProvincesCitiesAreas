package com.gs.base.util;

import com.gs.base.model.BaseModel;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * Created by GaoShan on 2017/4/12.
 */
public class MyModelUtil {
/*

    */
/**
     * 初始化BaseModel
     * 不设置默认参数
     *
     * @param request
     * @param model
     * @return
     *//*

    public static BaseModel initBaseModelForUpdate(HttpServletRequest request, BaseModel model) {
        String id = request.getParameter("id");
        String create_by = request.getParameter("create_by");
        String create_time = request.getParameter("create_time");
        String modify_by = request.getParameter("modify_by");
        String modify_time = request.getParameter("modify_time");
        String status = request.getParameter("status");
        String available = request.getParameter("available");
        String prepare1 = request.getParameter("prepare1");
        String prepare2 = request.getParameter("prepare2");
        String prepare3 = request.getParameter("prepare3");

        if (MyStringUtil.isNotEmpty(id)) {
            model.setId(id);
        }
        if (MyStringUtil.isNotEmpty(create_by)) {
            model.setCreate_by(create_by);
        }
        if (MyStringUtil.isNotEmpty(create_time)) {
            model.setCreate_time(MyDateUtil.getDateFormString(create_time));
        }
        if (MyStringUtil.isNotEmpty(modify_by)) {
            model.setModify_by(modify_by);
        }
        if (MyStringUtil.isNotEmpty(modify_time)) {
            model.setModify_time(MyDateUtil.getDateFormString(modify_time));
        }
        if (MyStringUtil.isNotEmpty(status)) {
            model.setStatus(status);
        }
        if (MyStringUtil.isNotEmpty(available)) {
            model.setAvailable(available);
        }
        if (MyStringUtil.isNotEmpty(prepare1)) {
            model.setPrepare1(prepare1);
        }
        if (MyStringUtil.isNotEmpty(prepare2)) {
            model.setPrepare2(prepare2);
        }
        if (MyStringUtil.isNotEmpty(prepare3)) {
            model.setPrepare3(prepare3);
        }

        return model;
    }

    */
/**
     * 初始化BaseModel
     * 并设置默认参数
     *
     * @param request
     * @param model
     * @return
     *//*

    public static BaseModel initBaseModelForInsert(HttpServletRequest request, BaseModel model) {
        //todo 还需要增加 初始化数据
        String id = request.getParameter("id");
        String create_by = request.getParameter("create_by");
        String create_time = request.getParameter("create_time");
        String modify_by = request.getParameter("modify_by");
        String modify_time = request.getParameter("modify_time");
        String status = request.getParameter("status");
        String available = request.getParameter("available");
        String prepare1 = request.getParameter("prepare1");
        String prepare2 = request.getParameter("prepare2");
        String prepare3 = request.getParameter("prepare3");


        if (MyStringUtil.isNotEmpty(id)) {
            model.setId(id);
        } else {
            model.setId(MyUUIDUtil.getUUID());
        }

        if (MyStringUtil.isNotEmpty(create_by)) {
            model.setCreate_by(create_by);
        } else {
            model.setCreate_by("admin");
        }

        if (MyStringUtil.isNotEmpty(create_time)) {
            model.setCreate_time(MyDateUtil.getDateFormString(create_time));
        } else {
            model.setCreate_time(new Date());
        }

        if (MyStringUtil.isNotEmpty(modify_by)) {
            model.setModify_by(modify_by);
        } else {
            model.setModify_by("admin");
        }

        if (MyStringUtil.isNotEmpty(modify_time)) {
            model.setModify_time(MyDateUtil.getDateFormString(modify_time));
        } else {
            model.setModify_time(new Date());
        }

        if (MyStringUtil.isNotEmpty(status)) {
            model.setStatus(status);
        } else {
            model.setStatus("1");
        }

        if (MyStringUtil.isNotEmpty(available)) {
            model.setAvailable(available);
        } else {
            model.setAvailable("1");
        }

        if (MyStringUtil.isNotEmpty(prepare1)) {
            model.setPrepare1(prepare1);
        }

        if (MyStringUtil.isNotEmpty(prepare2)) {
            model.setPrepare2(prepare2);
        }

        if (MyStringUtil.isNotEmpty(prepare3)) {
            model.setPrepare3(prepare3);
        }

        return model;
    }
*/

}
