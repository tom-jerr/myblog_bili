package com.uestclzy.service;

import com.uestclzy.domain.ResponseResult;
import com.uestclzy.domain.entity.User;

/**
 * @author lzy
 * @version 1.0.0
 * 2022/11/21 23:58
 */
public interface BlogLoginService {
    ResponseResult login(User user);
}
