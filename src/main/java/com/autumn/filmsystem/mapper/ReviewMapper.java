package com.autumn.filmsystem.mapper;

import com.autumn.filmsystem.entity.Review;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 影评/留言数据接口类
 */
@Mapper
public interface ReviewMapper {

    List<Review> findAll();

    Page<Review> findByPage(Review review);

    List<Review> findById(Integer id);

    //void create(Review review);

    //void update(Review review);

    void delete(Integer id);
}
