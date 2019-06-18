package com.autumn.filmsystem.service.impl;

import com.autumn.filmsystem.entity.PageBean;
import com.autumn.filmsystem.entity.UserInfo;
import com.autumn.filmsystem.mapper.UserInfoMapper;
import com.autumn.filmsystem.service.UserInfoService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Resource
    private UserInfoMapper userInfoMapper;

    /**
     * 分页查询-条件查询方法
     * @param userInfo 查询条件
     * @param pageCode 当前页
     * @param pageSize 每页的记录数
     * @return
     */
    @Override
    public PageBean findByPage(UserInfo userInfo, int pageCode, int pageSize) {
        //使用Mybatis分页插件
        PageHelper.startPage(pageCode, pageSize);
        //调用分页查询方法,其实就是查询所有数据,mybatis自动帮我们进行分页计算
        Page<UserInfo> page = userInfoMapper.findByPage(userInfo);
        return new PageBean(page.getTotal(), page.getResult());
    }

    @Override
    public List<UserInfo> findAll() {
        return userInfoMapper.findAll();
    }

    @Override
    public List<UserInfo> findById(Integer id) {
        return userInfoMapper.findById(id);
    }

    @Override
    public void delete(Integer... ids) {
        for (Integer id : ids) {
            userInfoMapper.delete(id);
        }
    }

    @Override
    public void update(UserInfo userInfo) {
        userInfoMapper.update(userInfo);
    }

    @Override
    public void create(UserInfo userInfo) {

    }
}
