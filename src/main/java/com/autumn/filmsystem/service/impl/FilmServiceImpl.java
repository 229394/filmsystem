package com.autumn.filmsystem.service.impl;

import com.autumn.filmsystem.entity.Film;
import com.autumn.filmsystem.entity.PageBean;
import com.autumn.filmsystem.mapper.FilmMapper;
import com.autumn.filmsystem.service.FilmService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author autumn_leaf
 * @date 2019/05/15
 */
@Service
public class FilmServiceImpl implements FilmService {

    @Resource
    private FilmMapper filmMapper;

    @Override
    public PageBean findByPage(Film film, int pageCode, int pageSize) {
        //使用Mybatis分页插件
        PageHelper.startPage(pageCode, pageSize);
        //调用分页查询方法，其实就是查询所有数据，mybatis自动帮我们进行分页计算
        Page<Film> page = filmMapper.findByPage(film);
        return new PageBean(page.getTotal(), page.getResult());
    }

    @Override
    public List<Film> findAll() {
        return filmMapper.findAll();
    }

    @Override
    public List<Film> findById(Integer id) {
        return filmMapper.findById(id);
    }

    @Override
    public void create(Film film) {
        filmMapper.create(film);
    }

    @Override
    public void delete(Integer... ids) {
        for (Integer id : ids) {
            filmMapper.delete(id);
        }
    }

    @Override
    public void update(Film film) {
        filmMapper.update(film);
    }
}
