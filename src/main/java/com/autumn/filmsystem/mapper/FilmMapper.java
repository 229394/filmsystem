package com.autumn.filmsystem.mapper;

import com.autumn.filmsystem.entity.Film;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FilmMapper {

    List<Film> findAll();

    Page<Film> findByPage(Film film);

    List<Film> findById(Integer id);

    void create(Film film);

    void update(Film film);

    void delete(Integer id);

}
