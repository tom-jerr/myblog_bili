package com.uestclzy.service;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.uestclzy.domain.ResponseResult;
import com.uestclzy.domain.entity.Link;

/**
 * @author lzy
 * @version 1.0.0
 * 2022/11/11 10:09
 */
public interface LinkService extends IService<Link> {
    ResponseResult getAllLink();
}
