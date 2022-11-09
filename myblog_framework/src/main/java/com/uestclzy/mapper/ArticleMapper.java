package com.uestclzy.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.uestclzy.domain.entity.Article;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author lzy
 * @version 1.0.0
 * 2022/11/7 18:14
 */

public interface ArticleMapper extends BaseMapper<Article> {
}
