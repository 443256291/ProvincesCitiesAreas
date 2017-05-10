package com.gs.base.model;

import com.gs.base.util.MyStringUtil;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by GaoShan on 2017/5/10.
 */
public class PcaCitiesPOJO {
    private String id;
    private String city_id;
    private String city_name;
    private String province_id;

    public static PcaCitiesPOJO getInstanceByRequestForUpdate(HttpServletRequest request) {
        PcaCitiesPOJO pcaCities = new PcaCitiesPOJO();
        String id = request.getParameter("id");
        String province_id = request.getParameter("province_id");
        String city_id = request.getParameter("city_id");
        String city_name = request.getParameter("city_name");

        if (MyStringUtil.isNotEmpty(id)) {
            pcaCities.setId(id);
        }
        if (MyStringUtil.isNotEmpty(province_id)) {
            pcaCities.setProvince_id(province_id);
        }
        if (MyStringUtil.isNotEmpty(city_id)) {
            pcaCities.setCity_id(city_id);
        }
        if (MyStringUtil.isNotEmpty(city_name)) {
            pcaCities.setCity_name(city_name);
        }
        return pcaCities;
    }

    @Override
    public String toString() {
        return "PcaCitiesPOJO{" +
                "id='" + id + '\'' +
                ", city_id='" + city_id + '\'' +
                ", city_name='" + city_name + '\'' +
                ", province_id='" + province_id + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCity_id() {
        return city_id;
    }

    public void setCity_id(String city_id) {
        this.city_id = city_id;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    public String getProvince_id() {
        return province_id;
    }

    public void setProvince_id(String province_id) {
        this.province_id = province_id;
    }
}
