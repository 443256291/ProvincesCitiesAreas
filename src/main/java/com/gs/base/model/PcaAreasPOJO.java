package com.gs.base.model;

import com.gs.base.util.MyStringUtil;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by GaoShan on 2017/5/10.
 */
public class PcaAreasPOJO {
    private String id;
    private String area_id;
    private String area_name;
    private String city_id;

    public static PcaAreasPOJO getInstanceByRequestForUpdate(HttpServletRequest request) {
        PcaAreasPOJO pcaAreasPOJO = new PcaAreasPOJO();
        String id = request.getParameter("id");
        String area_id = request.getParameter("area_id");
        String area_name = request.getParameter("area_name");
        String city_id = request.getParameter("city_id");

        if (MyStringUtil.isNotEmpty(id)) {
            pcaAreasPOJO.setId(id);
        }
        if (MyStringUtil.isNotEmpty(area_id)) {
            pcaAreasPOJO.setArea_id(area_id);
        }
        if (MyStringUtil.isNotEmpty(area_name)) {
            pcaAreasPOJO.setArea_name(area_name);
        }
        if (MyStringUtil.isNotEmpty(city_id)) {
            pcaAreasPOJO.setCity_id(city_id);
        }
        return pcaAreasPOJO;
    }
    
    @Override
    public String toString() {
        return "PcaAreasPOJO{" +
                "id='" + id + '\'' +
                ", area_id='" + area_id + '\'' +
                ", area_name='" + area_name + '\'' +
                ", city_id='" + city_id + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getArea_id() {
        return area_id;
    }

    public void setArea_id(String area_id) {
        this.area_id = area_id;
    }

    public String getArea_name() {
        return area_name;
    }

    public void setArea_name(String area_name) {
        this.area_name = area_name;
    }

    public String getCity_id() {
        return city_id;
    }

    public void setCity_id(String city_id) {
        this.city_id = city_id;
    }
}
