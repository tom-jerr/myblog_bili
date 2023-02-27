package com.uestclzy.service;

import com.uestclzy.domain.ResponseResult;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * @author lzy
 * @version 1.0.0
 * 2023/2/8 17:19
 */
public interface UploadService {
    ResponseResult uploadImg(MultipartFile img) throws IOException;
}
