package com.gs.base.model;

import java.util.List;

/**
 * Created by GaoShan on 2017/4/1.
 * Description:
 */
public class BgRolePermissionPOJO extends BaseModel {
    private String role_permission_id;
    private String role_id;
    private String permission_id;
    private List<BgPermissionPOJO> bgPermissionPOJOS;

    public List<BgPermissionPOJO> getBgPermissionPOJOS() {
        return bgPermissionPOJOS;
    }

    public void setBgPermissionPOJOS(List<BgPermissionPOJO> bgPermissionPOJOS) {
        this.bgPermissionPOJOS = bgPermissionPOJOS;
    }

    public String getRole_permission_id() {
        return role_permission_id;
    }

    public void setRole_permission_id(String role_permission_id) {
        this.role_permission_id = role_permission_id;
    }

    public String getRole_id() {
        return role_id;
    }

    public void setRole_id(String role_id) {
        this.role_id = role_id;
    }

    public String getPermission_id() {
        return permission_id;
    }

    public void setPermission_id(String permission_id) {
        this.permission_id = permission_id;
    }
}
