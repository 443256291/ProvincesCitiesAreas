package com.gs.base.model;

import com.gs.base.util.MyDateUtil;
import com.gs.base.util.MyStringUtil;
import com.gs.base.util.MyUUIDUtil;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * Created by GaoShan on 2017/3/27.
 * Description: 所有Model共有的属性
 */
public class BaseModel {
    private String id;//主键
    private String create_by;
    private Date create_time;
    private String modify_by;
    private Date modify_time;
    private String status;
    private String available;
    private String prepare1;
    private String prepare2;
    private String prepare3;
    /**
     * 初始化BaseModel
     * 不设置默认参数
     *
     * @param request
     * @param model
     * @return
     */
    public static <T>T getInstanceByRequestForUpdate(HttpServletRequest request, BaseModel model) {
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

        return (T)model;
    }

    /**
     * 初始化BaseModel
     * 并设置默认参数
     *
     * @param request
     * @param model
     * @return
     */
    public static  <T>T  getInstanceByRequestForInsert(HttpServletRequest request, BaseModel model) {
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

        return (T)model;
    }

    @Override
    public String toString() {
        return "BaseModel{" +
                "id='" + id + '\'' +
                ", create_by='" + create_by + '\'' +
                ", create_time=" + create_time +
                ", modify_by='" + modify_by + '\'' +
                ", modify_time=" + modify_time +
                ", status='" + status + '\'' +
                ", available='" + available + '\'' +
                ", prepare1='" + prepare1 + '\'' +
                ", prepare2='" + prepare2 + '\'' +
                ", prepare3='" + prepare3 + '\'' +
                '}';
    }

    public String getPrepare1() {
        return prepare1;
    }

    public void setPrepare1(String prepare1) {
        this.prepare1 = prepare1;
    }

    public String getPrepare2() {
        return prepare2;
    }

    public void setPrepare2(String prepare2) {
        this.prepare2 = prepare2;
    }

    public String getPrepare3() {
        return prepare3;
    }

    public void setPrepare3(String prepare3) {
        this.prepare3 = prepare3;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreate_by() {
        return create_by;
    }

    public void setCreate_by(String create_by) {
        this.create_by = create_by;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public String getModify_by() {
        return modify_by;
    }

    public void setModify_by(String modify_by) {
        this.modify_by = modify_by;
    }

    public Date getModify_time() {
        return modify_time;
    }

    public void setModify_time(Date modify_time) {
        this.modify_time = modify_time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
    }
}
