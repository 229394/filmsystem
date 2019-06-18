package com.autumn.filmsystem.controller;

import com.autumn.filmsystem.entity.Order;
import com.autumn.filmsystem.entity.PageBean;
import com.autumn.filmsystem.entity.Result;
import com.autumn.filmsystem.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    /**
     * 分页查询
     * @param order   查询条件
     * @param pageCode 当前页
     * @param pageSize 每页显示的记录数
     * @return
     */
    @RequestMapping("/findByConPage")
    public PageBean findByConPage(Order order,
                                  @RequestParam(value = "pageCode", required = false) int pageCode,
                                  @RequestParam(value = "pageSize", required = false) int pageSize) {
        return orderService.findByPage(order, pageCode, pageSize);
    }

    /**
     * 批量删除数据
     * @param ids 编号
     * @return
     */
    @RequestMapping("/delete")
    public Result delete(@RequestBody Integer... ids) {
        try {
            orderService.delete(ids);
            return new Result(true, "更新数据成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "发生未知错误!");
        }
    }

    /**
     * 根据id查询
     * @param id
     * @return
     */
    @RequestMapping("/findById")
    public List<Order> findById(@RequestParam(value = "id", required = false) Integer id) {
        return orderService.findById(id);
    }

}
