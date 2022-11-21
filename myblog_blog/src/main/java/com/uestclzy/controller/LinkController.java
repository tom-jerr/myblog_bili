package com.uestclzy.controller;

import com.uestclzy.domain.ResponseResult;
import com.uestclzy.service.LinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lzy
 * @version 1.0.0
 * 2022/11/11 10:07
 */

@RestController
@RequestMapping("link")
public class LinkController {

    @Autowired
    private LinkService linkService;

    @GetMapping("/getAllLink")
    public ResponseResult getAllLink(){
        return linkService.getAllLink();
    }
}
