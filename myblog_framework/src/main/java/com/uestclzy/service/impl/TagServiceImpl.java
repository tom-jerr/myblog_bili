package com.uestclzy.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.uestclzy.domain.entity.Tag;
import com.uestclzy.mapper.TagMapper;
import com.uestclzy.service.TagService;
import org.springframework.stereotype.Service;

/**
 * @author lzy
 * @version 1.0.0
 * 2023/2/27 21:18
 */
@Service("tagService")
public class TagServiceImpl extends ServiceImpl<TagMapper, Tag> implements TagService {
}
