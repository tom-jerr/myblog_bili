package com.uestclzy.controller;

import com.uestclzy.domain.ResponseResult;
import com.uestclzy.service.UploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * @author lzy
 * @version 1.0.0
 * 2023/2/8 17:15
 */
@RestController
public class UploadController {
    @Autowired
    private UploadService uploadService;

    @PostMapping("/upload")
    public ResponseResult uploadImg(MultipartFile img) throws IOException {
        return uploadService.uploadImg(img);
    }
}
