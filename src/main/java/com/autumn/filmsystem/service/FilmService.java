package com.autumn.filmsystem.service;

import com.autumn.filmsystem.entity.Film;
import com.autumn.filmsystem.entity.PageBean;

public interface FilmService extends BaseService<Film>{

    /**
     * 分页查询
     * @param film 查询条件
     * @param pageCode 当前页
     * @param pageSize 每页的记录数
     * @return
     */
    PageBean findByPage(Film film, int pageCode, int pageSize);

}
