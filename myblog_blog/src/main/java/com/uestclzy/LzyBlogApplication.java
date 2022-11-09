package com.uestclzy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.scheduling.annotation.EnableScheduling;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author lzy
 * @version 1.0.0
 * 2022/11/7 17:59
 */
@SpringBootApplication(scanBasePackages = {"com"})
//@EnableAutoConfiguration(exclude = {org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class})
@MapperScan("com.uestclzy.mapper")
@EnableScheduling
@EnableSwagger2
public class LzyBlogApplication {
    public static void main(String[] args) {
        SpringApplication.run(LzyBlogApplication.class, args);
    }
}
