package com.uestclzy.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.uestclzy.domain.ResponseResult;
import com.uestclzy.domain.dto.TagListDto;
import com.uestclzy.domain.entity.Tag;
import com.uestclzy.domain.vo.PageVo;
import com.uestclzy.domain.vo.TagVo;

import java.util.List;

/**
 * @author lzy
 * @version 1.0.0
 * 2023/2/27 21:17
 */
public interface TagService extends IService<Tag> {
    ResponseResult<PageVo> pageTagList(Integer pageNum, Integer pageSize, TagListDto tagListDto);

    List<TagVo> listAllTag();
}
