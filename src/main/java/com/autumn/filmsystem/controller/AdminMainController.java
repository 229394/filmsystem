package com.autumn.filmsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminMainController {

    /**
     * @return 管理员首页
     */
    @GetMapping(value = {"/admin/index"})
    public String AdminIndex() {
        return "admin/index";
    }

    /**
     * @return 用户信息列表
     */
    @GetMapping(value = {"/userInfo"})
    public String userInfo() {
        return "site/userInfo";
    }

    /**
     * @return 影片列表
     */
    @GetMapping(value = {"/film"})
    public String filmList() {
        return "site/film";
    }

    /**
     * @return 影评列表
     */
    @GetMapping(value = {"/review"})
    public String reviewList() {
        return "site/review";
    }

    /**
     * @return 订单列表
     */
    @GetMapping(value = {"/order"})
    public String orderList() {
        return "site/order";
    }

}
