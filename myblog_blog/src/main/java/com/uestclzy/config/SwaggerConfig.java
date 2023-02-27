package com.uestclzy.config;

import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @author lzy
 * @version 1.0.0
 * 2023/2/27 21:01
 */
public class SwaggerConfig {
    @Bean
    public Docket customDocket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.uestclzy.controller"))
                .build();
    }

    private ApiInfo apiInfo() {
        Contact contact = new Contact("Lzy", "", "");
        return new ApiInfoBuilder()
                .title("文档标题1")
                .contact(contact)   // 联系方式
                .version("1.1.1")  // 版本
                .build();
    }
}
