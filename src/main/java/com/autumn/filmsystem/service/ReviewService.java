package com.autumn.filmsystem.service;

import com.autumn.filmsystem.entity.PageBean;
import com.autumn.filmsystem.entity.Review;

public interface ReviewService extends BaseService<Review>{

    /**
     * 分页查询
     * @param review 查询条件
     * @param pageCode 当前页
     * @param pageSize 每页的记录数
     * @return
     */
    PageBean findByPage(Review review, int pageCode, int pageSize);

}
