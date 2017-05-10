package com.gs.base.model;

import java.util.List;

/**
 * Created by GaoShan on 2017/4/1.
 * Description: 后台角色
 */
public class BgRolePOJO extends BaseModel {
    private String role_id;
    private String role_name;
    private List<BgPermissionPOJO> permissions;

    public List<BgPermissionPOJO> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<BgPermissionPOJO> permissions) {
        this.permissions = permissions;
    }

    public String getRole_id() {
        return role_id;
    }

    public void setRole_id(String role_id) {
        this.role_id = role_id;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }
}
