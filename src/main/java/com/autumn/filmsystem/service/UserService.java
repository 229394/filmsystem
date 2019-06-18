package com.autumn.filmsystem.service;


import com.autumn.filmsystem.entity.User;

/**
 * 用户服务接口类
 * @author autumn_leaf
 * @date 2019/5/12
 */
public interface UserService extends BaseService<User> {

    User findByName(String name);
}
