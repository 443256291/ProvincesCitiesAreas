package com.gs.base.model;

import com.gs.base.util.MyStringUtil;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by GaoShan on 2017/5/10.
 * 省
 */
public class PcaProvincesPOJO {
    private String id;
    private String province_id;
    private String province_name;

    public static PcaProvincesPOJO getInstanceByRequestForUpdate(HttpServletRequest request) {
        PcaProvincesPOJO pcaProvincesPOJO = new PcaProvincesPOJO();
        String id = request.getParameter("id");
        String province_id = request.getParameter("province_id");
        String province_name = request.getParameter("province_name");

        if (MyStringUtil.isNotEmpty(id)) {
            pcaProvincesPOJO.setId(id);
        }
        if (MyStringUtil.isNotEmpty(province_id)) {
            pcaProvincesPOJO.setProvince_id(province_id);
        }
        if (MyStringUtil.isNotEmpty(province_name)) {
            pcaProvincesPOJO.setProvince_name(province_name);
        }
        return pcaProvincesPOJO;
    }

    @Override
    public String toString() {
        return "PcaProvincesPOJO{" +
                "id='" + id + '\'' +
                ", province_id='" + province_id + '\'' +
                ", province_name='" + province_name + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProvince_id() {
        return province_id;
    }

    public void setProvince_id(String province_id) {
        this.province_id = province_id;
    }

    public String getProvince_name() {
        return province_name;
    }

    public void setProvince_name(String province_name) {
        this.province_name = province_name;
    }
}
