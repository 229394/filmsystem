package com.autumn.filmsystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;

import javax.servlet.MultipartConfigElement;

@SpringBootApplication
@MapperScan("com.autumn.filmsystem.mapper")
public class FilmsystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(FilmsystemApplication.class, args);
    }
//    @Bean
//    MultipartConfigElement multipartConfigElement() {
//        MultipartConfigFactory factory = new MultipartConfigFactory();
//        factory.setLocation("D:/MyDownloads/filmsystem/src/main/resources");
//        return  factory.createMultipartConfig();
//    }
}
