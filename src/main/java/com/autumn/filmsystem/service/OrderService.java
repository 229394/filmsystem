package com.autumn.filmsystem.service;

import com.autumn.filmsystem.entity.Order;
import com.autumn.filmsystem.entity.PageBean;

/**
 * 订单服务接口类
 *
 */
public interface OrderService extends BaseService<Order> {

    /**
     * 分页查询
     * @param order 查询条件
     * @param pageCode 当前页
     * @param pageSize 每页的记录数
     * @return
     */
    PageBean findByPage(Order order, int pageCode, int pageSize);

}
