package com.uestclzy.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.uestclzy.domain.entity.RoleMenu;
import com.uestclzy.mapper.RoleMenuMapper;
import com.uestclzy.service.RoleMenuService;
import org.springframework.stereotype.Service;

/**
 * @author lzy
 * @version 1.0.0
 * 2023/4/13 23:12
 */
@Service
public class RoleMenuServiceImpl extends ServiceImpl<RoleMenuMapper, RoleMenu> implements RoleMenuService {

    @Override
    public void deleteRoleMenuByRoleId(Long id) {
        LambdaQueryWrapper<RoleMenu> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(RoleMenu::getRoleId,id);
        remove(queryWrapper);
    }
}
