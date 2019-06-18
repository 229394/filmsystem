package com.autumn.filmsystem.entity;

import java.io.Serializable;

/**
 * 电影实体类
 * @author autumn_leaf
 * @date 2019/05/15
 */
public class Film implements Serializable {
    //编号,主键,自增
    private Integer id;
    //电影标题
    private String title;
    //导演
    private String director;
    //主演
    private String actor;
    //电影类别
    private String filmType;
    //电影时长
    private String filmTime;
    //电影图片
    private String image;
    //电影简介
    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getFilmType() {
        return filmType;
    }

    public void setFilmType(String filmType) {
        this.filmType = filmType;
    }

    public String getFilmTime() {
        return filmTime;
    }

    public void setFilmTime(String filmTime) {
        this.filmTime = filmTime;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
