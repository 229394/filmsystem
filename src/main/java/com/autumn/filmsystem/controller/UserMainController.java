package com.autumn.filmsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserMainController {

    /**
     * @return 用户首页
     */
    @GetMapping("/index")
    public String userIndex() {
        return "user/index";
    }
}
