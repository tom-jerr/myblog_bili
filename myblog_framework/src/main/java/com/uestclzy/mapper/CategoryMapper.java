package com.uestclzy.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.uestclzy.domain.entity.Category;
import org.apache.ibatis.annotations.Mapper;


/**
 * 分类表(Category)表数据库访问层
 *
 * @author makejava
 * @since 2022-11-09 23:10:28
 */
@Mapper
public interface CategoryMapper extends BaseMapper<Category> {

}
