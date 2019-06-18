package com.autumn.filmsystem.controller;

import com.autumn.filmsystem.entity.Admin;
import com.autumn.filmsystem.entity.Result;
import com.autumn.filmsystem.entity.User;
import com.autumn.filmsystem.service.AdminService;
import com.autumn.filmsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 * @author autumn_leaf
 * @date 2019/5/12
 */
@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @Autowired
    private AdminService adminService;

    /**
     * 用户登录
     * @param username 用户名
     * @param password 密码
     * @return 登陆结果
     */
    @RequestMapping("/login")
    @ResponseBody
    public Result login(@RequestParam("username") String username, @RequestParam("password") String password) {
        User user = userService.findByName(username);
        if (user != null) {
            if (user.getPassword().equals(password)) {
                ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
                attributes.getRequest().getSession().setAttribute("user", user); //将登陆用户信息存入到session域对象中
                return new Result(true, user.getUsername());
            }
        }
        return new Result(false, "登录失败");
    }

    /**
     * 管理员登录
     * @param adminname 管理员名
     * @param adminpwd 密码
     * @return 登录结果
     */
    @RequestMapping("/admin/login")
    @ResponseBody
    public Result adminLogin(@RequestParam("adminname") String adminname, @RequestParam("adminpwd") String adminpwd) {
        Admin admin = adminService.findByName(adminname);
        if (admin != null) {
            if (admin.getAdminpwd().equals(adminpwd)) {
                ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
                attributes.getRequest().getSession().setAttribute("admin", admin); //将登陆管理信息存入到session域对象中
                return new Result(true, admin.getAdminname());
            }
        }
        return new Result(false, "登录失败");
    }

    /**
     * 管理员注销
     * @return 管理员登录界面
     */
    @RequestMapping("/logout")
    public String logout() {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        attributes.getRequest().getSession().removeAttribute("admin");
        return "admin/login";
    }

    /**
     * 注册
     * @param username 用户名
     * @param password 密码
     * @return 注册结果
     */
    @ResponseBody
    @RequestMapping("/register")
    public Result register(@RequestParam("username") String username, @RequestParam("password") String password) {
        try {
            userService.create(new User(username, password));
            ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
            attributes.getRequest().getSession().setAttribute("user", new User(username, password)); //将登陆用户信息存入到session域对象中
            return new Result(true, username);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new Result(false, "发生未知错误");
    }

    /**
     * 用户登录
     * @return 用户登录界面
     */
    @GetMapping("/login")
    public String login() {
        return "user/login";
    }

    /**
     * 用户注册
     * @return 注册界面
     */
    @GetMapping("/register")
    public String register() {
        return "user/register";
    }

    /**
     * 管理员登录
     * @return 登录界面
     */
    @GetMapping("/admin/login")
    public String adminLogin() {
        return "admin/login";
    }

}
