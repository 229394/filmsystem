package com.autumn.filmsystem.interceptor;

import com.autumn.filmsystem.entity.Admin;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * 自定义拦截器,实现简单的登录拦截
 * @author autumn_leaf
 * @date 2019/5/12
 */
@Component
@Aspect
public class MyInterceptor {

    @Pointcut("within (com.autumn.filmsystem.controller..*) && !within(com.autumn.filmsystem.controller.LoginController)")
    public void pointCut() {

    }

    @Around("pointCut()")
    public Object trackInfo(ProceedingJoinPoint joinPoint) throws Throwable {

        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        request.getSession().setAttribute("admin", new Admin()); //测试，手动添加用户登录的session
        Admin admin = (Admin) request.getSession().getAttribute("admin");
        if (admin == null) {
            //System.out.println("-----------用户未登录-----------");
            attributes.getResponse().sendRedirect("/admin/login"); //手动转发到/login映射路径
        }
        //System.out.println("-----------用户已登录-----------");
        //一定要指定Object返回值,若AOP拦截的Controller return了一个视图地址,那么本来Controller应该跳转到这个视图地址的，但是被AOP拦截了，那么原来Controller仍会执行return，但是视图地址却找不到404了
        //切记一定要调用proceed()方法
        //proceed():执行被通知的方法,如不调用将会阻止被通知的方法的调用,也就导致Controller中的return会404
        return joinPoint.proceed();
    }

}
