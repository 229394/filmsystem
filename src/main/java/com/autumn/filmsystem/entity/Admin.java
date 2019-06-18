package com.autumn.filmsystem.entity;

import java.io.Serializable;

/**
 * 管理员实体类
 * @author autumn_leaf
 * @date 2019/5/13
 */
public class Admin implements Serializable {

    private Integer id;
    private String adminname;
    private String adminpwd;

    public Admin() {
    }

    public Admin(String adminname, String adminpwd) {
        this.adminname = adminname;
        this.adminpwd = adminpwd;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdminname() {
        return adminname;
    }

    public void setAdminname(String adminname) {
        this.adminname = adminname;
    }

    public String getAdminpwd() {
        return adminpwd;
    }

    public void setAdminpwd(String adminpwd) {
        this.adminpwd = adminpwd;
    }
}
