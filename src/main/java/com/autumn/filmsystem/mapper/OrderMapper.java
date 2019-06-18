package com.autumn.filmsystem.mapper;

import com.autumn.filmsystem.entity.Order;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 订单数据接口类
 *
 */
@Mapper
public interface OrderMapper {

    List<Order> findAll();

    Page<Order> findByPage(Order order);

    List<Order> findById(Integer id);

    //void create(Order order);

    //void update(Order order);

    void delete(Integer id);

}
