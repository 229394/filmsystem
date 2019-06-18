package com.autumn.filmsystem.entity;

import java.io.Serializable;

/**
 * 用户信息实体类
 * @author autumn_leaf
 */
public class UserInfo implements Serializable {
    //编号,主键,自增
    private Integer id;
    //用户昵称
    private String nickname;
    //用户性别
    private String sex;
    //用户生日
    private String birthday;
    //个人简介
    private String introduction;
    //联系方式
    private String phone;
    //用户名(与tb_user中用户名一致)
    private String username;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
