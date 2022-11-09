package com.uestclzy.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.uestclzy.domain.ResponseResult;
import com.uestclzy.domain.entity.Article;
import com.uestclzy.mapper.ArticleMapper;
import com.uestclzy.service.ArticleService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lzy
 * @version 1.0.0
 * 2022/11/7 18:20
 */

@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements ArticleService {

    @Override
    public ResponseResult hotArticleList() {
        LambdaQueryWrapper<Article> queryWrapper = new LambdaQueryWrapper<>();
        //必须是正式文章
        queryWrapper.eq(Article::getStatus, 0);
        //按照浏览量排序
        queryWrapper.orderByDesc(Article::getViewCount);
        //最多查询10条
        Page<Article> page = new Page<>(1,10);
        page(page,queryWrapper);

        List<Article> articleList = page.getRecords();
        return ResponseResult.okResult(articleList);
    }
}
