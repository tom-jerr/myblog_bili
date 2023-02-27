package com.uestclzy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author lzy
 * @version 1.0.0
 * 2023/2/27 21:03
 */
@SpringBootApplication

@MapperScan("com.uestclzy.mapper")
public class BlogAdminApplication {
    public static void main(String[] args){
        SpringApplication.run(BlogAdminApplication.class, args);
    }
}
