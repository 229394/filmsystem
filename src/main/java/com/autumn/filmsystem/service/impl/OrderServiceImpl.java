package com.autumn.filmsystem.service.impl;

import com.autumn.filmsystem.entity.Order;
import com.autumn.filmsystem.entity.PageBean;
import com.autumn.filmsystem.mapper.OrderMapper;
import com.autumn.filmsystem.service.OrderService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderMapper orderMapper;

    @Override
    public PageBean findByPage(Order order, int pageCode, int pageSize) {
        //使用Mybatis分页插件
        PageHelper.startPage(pageCode, pageSize);
        //调用分页查询方法,其实就是查询所有数据,mybatis自动帮我们进行分页计算
        Page<Order> page = orderMapper.findByPage(order);
        return new PageBean(page.getTotal(), page.getResult());
    }

    @Override
    public List<Order> findAll() {
        return orderMapper.findAll();
    }

    @Override
    public List<Order> findById(Integer id) {
        return orderMapper.findById(id);
    }

    @Override
    public void create(Order order) {

    }

    @Override
    public void delete(Integer... ids) {
        for (Integer id : ids) {
            orderMapper.delete(id);
        }
    }

    @Override
    public void update(Order order) {

    }
}
