package com.uestclzy.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.uestclzy.domain.entity.ArticleTag;
import com.uestclzy.mapper.ArticleTagMapper;
import com.uestclzy.service.ArticleTagService;
import org.springframework.stereotype.Service;

/**
 * @author lzy
 * @version 1.0.0
 * 2023/3/11 20:26
 */
@Service
public class ArticleTagServiceImpl extends ServiceImpl<ArticleTagMapper, ArticleTag> implements ArticleTagService {
}
