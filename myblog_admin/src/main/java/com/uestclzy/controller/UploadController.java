package com.uestclzy.controller;

import com.uestclzy.domain.ResponseResult;
import com.uestclzy.service.UploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * @author lzy
 * @version 1.0.0
 * 2023/4/13 22:50
 */
@RestController
public class UploadController {

    @Autowired
    private UploadService uploadService;

    @PostMapping("/upload")
    public ResponseResult uploadImg(@RequestParam("img") MultipartFile multipartFile) {
        try {
            return uploadService.uploadImg(multipartFile);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("文件上传上传失败");
        }
    }
}
