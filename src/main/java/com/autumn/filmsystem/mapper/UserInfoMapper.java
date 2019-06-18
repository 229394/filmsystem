package com.autumn.filmsystem.mapper;

import com.autumn.filmsystem.entity.UserInfo;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserInfoMapper {

    List<UserInfo> findAll();

    Page<UserInfo> findByPage(UserInfo userInfo);

    List<UserInfo> findById(Integer id);

    void update(UserInfo userInfo);

    void delete(Integer id);
}
