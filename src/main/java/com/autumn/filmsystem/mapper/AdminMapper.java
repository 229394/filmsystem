package com.autumn.filmsystem.mapper;

import com.autumn.filmsystem.entity.Admin;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AdminMapper {

    List<Admin> findAll();

    List<Admin> findById(Integer id);

    void create(Admin admin);

    void delete(Integer id);

    void update(Admin admin);

    Admin findByName(String name);
}
