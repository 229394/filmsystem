package com.autumn.filmsystem.service;

import java.util.List;

/**
 * 通用的Service层接口
 * @auther autumn_leaf
 * @date 2019/5/12
 */
public interface BaseService<T> {

    /**
     * 查询所有
     *
     * @return
     */
    List<T> findAll();

    /**
     * 根据ID查询
     *
     * @param id
     * @return
     */
    List<T> findById(Integer id);

    /**
     * 添加
     *
     * @param t
     */
    void create(T t);

    /**
     * 删除（批量）
     *
     * @param ids
     */
    void delete(Integer... ids);

    /**
     * 修改
     *
     * @param t
     */
    void update(T t);
}
