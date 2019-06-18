package com.autumn.filmsystem.entity;

import java.io.Serializable;
import java.util.List;

/**
 * 分页实体类
 * @author autumn_leaf
 * @date 2019/5/14
 */
public class PageBean implements Serializable {

    //当前页
    private long total;
    //当前页记录
    private List rows;

    public PageBean(long total, List rows) {
        this.total = total;
        this.rows = rows;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List getRows() {
        return rows;
    }

    public void setRows(List rows) {
        this.rows = rows;
    }
}
