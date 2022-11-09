package com.uestclzy.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.uestclzy.domain.ResponseResult;
import com.uestclzy.domain.entity.Category;


/**
 * 分类表(Category)表服务接口
 *
 * @author makejava
 * @since 2022-11-09 23:10:58
 */
public interface CategoryService extends IService<Category> {
    ResponseResult getCategoryList();
    ResponseResult listAllCategorys();
}

