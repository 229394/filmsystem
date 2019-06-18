package com.autumn.filmsystem.controller;

import com.autumn.filmsystem.entity.Film;
import com.autumn.filmsystem.entity.PageBean;
import com.autumn.filmsystem.entity.Result;
import com.autumn.filmsystem.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/film")
public class FilmController {

    @Autowired
    private FilmService filmService;

    /**
     * 分页查询
     * @param film    查询条件
     * @param pageCode 当前页
     * @param pageSize 每页显示的记录数
     * @ 查询到的电影列表
     */
    @RequestMapping("/findByConPage")
    public PageBean findByConPage(Film film,
                                  @RequestParam(value = "pageCode", required = false) int pageCode,
                                  @RequestParam(value = "pageSize", required = false) int pageSize) {
        return filmService.findByPage(film, pageCode, pageSize);
    }

    /**
     * 新增电影
     * @param film 电影实体
     * @return 上传结果
     */
    @RequestMapping("/create")
    public Result create(@RequestBody Film film) {
        try {
            filmService.create(film);
            return new Result(true, "创建成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "发生未知错误");
        }
    }

    /**
     * 更新数据成功
     * @param film
     * @return
     */
    @RequestMapping("/update")
    public Result update(@RequestBody Film film) {
        try {
            filmService.update(film);
            return new Result(true, "更新数据成功!");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "发生未知错误!");
        }
    }

    /**
     * 批量删除数据
     * @param ids
     * @return
     */
    @RequestMapping("/delete")
    public Result delete(@RequestBody Integer... ids) {
        try {
            filmService.delete(ids);
            return new Result(true, "更新数据成功!");
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
    public List<Film> findById(@RequestParam(value = "id", required = false) Integer id) {
        return filmService.findById(id);
    }

}
