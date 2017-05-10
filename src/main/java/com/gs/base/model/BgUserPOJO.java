package com.gs.base.model;

import java.util.List;

/**
 * Created by GaoShan on 2017/4/1.
 * Description:
 */
public class BgUserPOJO extends BaseModel {
    private String user_id;
    private String nickname;
    private String gender;
    private String age ;
    private String email;
    private String phone;
    private String description;
    private List<BgRolePOJO> bgRolePOJOS;

    public List<BgRolePOJO> getBgRolePOJOS() {
        return bgRolePOJOS;
    }

    public void setBgRolePOJOS(List<BgRolePOJO> bgRolePOJOS) {
        this.bgRolePOJOS = bgRolePOJOS;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
