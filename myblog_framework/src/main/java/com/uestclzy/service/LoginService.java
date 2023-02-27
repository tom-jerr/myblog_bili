package com.uestclzy.service;

import com.uestclzy.domain.ResponseResult;
import com.uestclzy.domain.entity.User;

/**
 * @author lzy
 * @version 1.0.0
 * 2023/2/27 21:30
 */
public interface LoginService {
    ResponseResult login(User user);
    ResponseResult logout();
}
