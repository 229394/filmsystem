package com.autumn.filmsystem.entity;

import java.io.Serializable;

/**
 * 用户实体类
 * @author autumn_leaf
 * @date 2019/05/12
 */
public class User implements Serializable {

    private Integer id; //用户编号
    private String username; //用户名
    private String password; //用户密码

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

}
