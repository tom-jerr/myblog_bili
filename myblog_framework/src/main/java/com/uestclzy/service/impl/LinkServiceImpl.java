package com.uestclzy.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.uestclzy.constants.SystemConstants;
import com.uestclzy.domain.ResponseResult;
import com.uestclzy.domain.entity.Link;
import com.uestclzy.domain.vo.LinkVo;
import com.uestclzy.mapper.LinkMapper;
import com.uestclzy.service.LinkService;
import com.uestclzy.utils.BeanCopyUtils;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lzy
 * @version 1.0.0
 * 2022/11/11 10:13
 */

@Service("linkService")
public class LinkServiceImpl extends ServiceImpl<LinkMapper, Link> implements LinkService {
    @Override
    public ResponseResult getAllLink() {
        LambdaQueryWrapper<Link> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Link::getStatus, SystemConstants.LINK_STATUS_NORMAL);
        List<Link> list = list(queryWrapper);
        List<LinkVo> linkVos = BeanCopyUtils.copyBeanList(list, LinkVo.class);
        return ResponseResult.okResult(linkVos);

    }
}
