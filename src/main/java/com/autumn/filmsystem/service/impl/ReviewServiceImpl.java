package com.autumn.filmsystem.service.impl;

import com.autumn.filmsystem.entity.PageBean;
import com.autumn.filmsystem.entity.Review;
import com.autumn.filmsystem.mapper.ReviewMapper;
import com.autumn.filmsystem.service.ReviewService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService {

    @Resource
    private ReviewMapper reviewMapper;

    @Override
    public PageBean findByPage(Review review, int pageCode, int pageSize) {
        //使用Mybatis分页插件
        PageHelper.startPage(pageCode, pageSize);
        //调用分页查询方法，其实就是查询所有数据，mybatis自动帮我们进行分页计算
        Page<Review> page = reviewMapper.findByPage(review);
        return new PageBean(page.getTotal(), page.getResult());
    }

    @Override
    public List<Review> findAll() {
        return reviewMapper.findAll();
    }

    @Override
    public List<Review> findById(Integer id) {
        return reviewMapper.findById(id);
    }

    @Override
    public void create(Review review) {

    }

    @Override
    public void delete(Integer... ids) {
        for (Integer id : ids) {
            reviewMapper.delete(id);
        }
    }

    @Override
    public void update(Review review) {

    }
}
