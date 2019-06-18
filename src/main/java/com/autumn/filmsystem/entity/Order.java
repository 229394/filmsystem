package com.autumn.filmsystem.entity;

import java.io.Serializable;

/**
 * 电影订单实体类
 * @author autumn_leaf
 */
public class Order implements Serializable {
    //编号,主键,自增
    private Integer id;
    //用户名(与tb_user中用户名一致)
    private String username;
    //电影名称(与tb_film中电影名称一致)
    private String title;
    //订单数量
    private Integer orderNum;
    //订单单价
    private String price;
    //订单总价(数量*单价)
    private String totalPrice;
    //订单日期
    private String orderTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }
}
