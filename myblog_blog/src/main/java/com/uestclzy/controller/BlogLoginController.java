package com.uestclzy.controller;

import com.uestclzy.domain.ResponseResult;
import com.uestclzy.domain.entity.User;
import com.uestclzy.service.BlogLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lzy
 * @version 1.0.0
 * 2022/11/21 23:54
 */
@RestController
public class BlogLoginController {

    @Autowired
    private BlogLoginService blogLoginService;

    @PostMapping("/login")
    public ResponseResult login(@RequestBody User user){
        return blogLoginService.login(user);
    }
}
