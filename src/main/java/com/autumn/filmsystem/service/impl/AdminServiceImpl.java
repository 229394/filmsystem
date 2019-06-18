package com.autumn.filmsystem.service.impl;

import com.autumn.filmsystem.entity.Admin;
import com.autumn.filmsystem.mapper.AdminMapper;
import com.autumn.filmsystem.service.AdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {

    @Resource
    private AdminMapper adminMapper;

    @Override
    public Admin findByName(String name) {
        return adminMapper.findByName(name);
    }

    @Override
    public List<Admin> findAll() {
        return adminMapper.findAll();
    }

    @Override
    public List<Admin> findById(Integer id) {
        return adminMapper.findById(id);
    }

    @Override
    public void create(Admin admin) {
        adminMapper.create(admin);
    }

    @Override
    public void delete(Integer... ids) {
        for (Integer id : ids) {
            adminMapper.delete(id);
        }
    }

    @Override
    public void update(Admin admin) {
        adminMapper.update(admin);
    }

}
