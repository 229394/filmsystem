package com.autumn.filmsystem.service;

import com.autumn.filmsystem.entity.PageBean;
import com.autumn.filmsystem.entity.UserInfo;


public interface UserInfoService extends BaseService<UserInfo> {

    /**
     * 分页查询
     * @param userInfo 查询条件
     * @param pageCode 当前页
     * @param pageSize 每页的记录数
     * @return
     */
    PageBean findByPage(UserInfo userInfo,int pageCode,int pageSize);
}
