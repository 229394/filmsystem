package com.autumn.filmsystem.controller;

import com.autumn.filmsystem.entity.PageBean;
import com.autumn.filmsystem.entity.Result;
import com.autumn.filmsystem.entity.UserInfo;
import com.autumn.filmsystem.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author autumn_leaf
 * @date 2019/5/14
 */
@RestController
@RequestMapping("/userInfo")
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    /**
     * 分页查询
     * @param userInfo 查询条件
     * @param pageCode 当前页
     * @param pageSize 每页显示的记录数
     * @return
     */
    @RequestMapping("/findByConPage")
    public PageBean findByConPage(UserInfo userInfo,
                                  @RequestParam(value = "pageCode", required = false) int pageCode,
                                  @RequestParam(value = "pageSize", required = false) int pageSize) {
        return userInfoService.findByPage(userInfo, pageCode, pageSize);
    }

    /**
     * 更新数据
     * @param userInfo 用户信息对象
     * @return
     */
    @RequestMapping("/update")
    public Result update(@RequestBody UserInfo userInfo) {
        try {
            userInfoService.update(userInfo);
            return new Result(true, "更新数据成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "发生未知错误");
        }
    }

    /**
     * 批量删除数据
     * @param ids 编号
     * @return
     */
    @RequestMapping("/delete")
    public Result delete(@RequestBody Integer... ids) {
        try {
            userInfoService.delete(ids);
            return new Result(true, "更新数据成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "发生未知错误");
        }
    }

    /**
     * 根据id查询
     * @param id 编号
     * @return
     */
    @RequestMapping("/findById")
    public List<UserInfo> findById(@RequestParam(value = "id", required = false) Integer id) {
        return userInfoService.findById(id);
    }


}
