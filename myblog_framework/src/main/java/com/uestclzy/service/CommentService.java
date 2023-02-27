package com.uestclzy.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.uestclzy.domain.ResponseResult;
import com.uestclzy.domain.entity.Comment;

/**
 * @author lzy
 * @version 1.0.0
 * 2022/11/22 21:21
 */
public interface CommentService extends IService<Comment> {
    ResponseResult commentList(Long articleId, Integer pageNum, Integer PageSize);
    ResponseResult addComment(Comment comment);
}
