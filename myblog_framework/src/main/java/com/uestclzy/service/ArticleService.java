package com.uestclzy.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.uestclzy.domain.ResponseResult;
import com.uestclzy.domain.dto.AddArticleDto;
import com.uestclzy.domain.dto.ArticleDto;
import com.uestclzy.domain.entity.Article;
import com.uestclzy.domain.vo.ArticleVo;
import com.uestclzy.domain.vo.PageVo;
import org.springframework.stereotype.Component;

/**
 * @author lzy
 * @version 1.0.0
 * 2022/11/7 18:20
 */

public interface ArticleService extends IService<Article> {
    ResponseResult hotArticleList();

    ResponseResult articleList(Integer pageNum, Integer pageSize, Long categoryId);

    ResponseResult getArticleDetail(Long id);

    ResponseResult updateViewCount(Long id);

    ResponseResult add(AddArticleDto article);

    PageVo selectArticlePage(Article article, Integer pageNum, Integer pageSize);

    ArticleVo getInfo(Long id);

    void edit(ArticleDto article);
}
