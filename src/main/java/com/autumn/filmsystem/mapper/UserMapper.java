package com.autumn.filmsystem.mapper;

import com.autumn.filmsystem.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @auther autumn_leaf
 * @date 2019/5/12
 */
@Mapper
public interface UserMapper {

    List<User> findAll();

    List<User> findById(Integer id);

    void create(User user);

    void delete(Integer id);

    void update(User user);

    User findByName(String name);

}
