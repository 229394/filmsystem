package com.autumn.filmsystem.entity;

import java.io.Serializable;

/**
 * 评论/留言实体类
 * @author autumn_leaf
 */
public class Review implements Serializable {
    //编号,主键,自增
    private Integer id;
    //用户名(此处来自用户表tb_user)
    private String username;
    //电影名称(此处来自电影表tb_film)
    private String title;
    //影评内容
    private String content;
    //电影评分
    private String score;
    //影评时间
    private String reviewTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getReviewTime() {
        return reviewTime;
    }

    public void setReviewTime(String reviewTime) {
        this.reviewTime = reviewTime;
    }
}
