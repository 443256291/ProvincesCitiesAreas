package com.gs.base.model;

import org.springframework.stereotype.Component;

/**
 * Created by GaoShan on 2017/3/9.
 */
@Component
public class BgLoginPOJO extends BaseModel {

    private String username;
    private String password;
    private String user_id;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

}
