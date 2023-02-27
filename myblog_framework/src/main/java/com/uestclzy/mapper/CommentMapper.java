package com.uestclzy.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.uestclzy.domain.entity.Comment;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author lzy
 * @version 1.0.0
 * 2022/11/22 21:28
 */
@Mapper
public interface CommentMapper extends BaseMapper<Comment> {
}
