package com.autumn.filmsystem.service;

import com.autumn.filmsystem.entity.Admin;

/**
 * 管理员服务接口类
 * @author autumn_leaf
 * @date 2019/5/13
 */
public interface AdminService extends BaseService<Admin> {

    Admin findByName(String name);
}
