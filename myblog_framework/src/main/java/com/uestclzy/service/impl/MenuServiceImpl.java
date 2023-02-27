package com.uestclzy.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.uestclzy.constants.SystemConstants;
import com.uestclzy.domain.entity.Menu;
import com.uestclzy.mapper.MenuMapper;
import com.uestclzy.service.MenuService;
import com.uestclzy.utils.SecurityUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author lzy
 * @version 1.0.0
 * 2023/2/27 21:46
 */
@Service("menuService")
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements MenuService {
    @Override
    public List<String> selectPermsByUserId(Long id) {
        //如果是管理员，返回所有的权限
        if(SecurityUtils.isAdmin()){
            LambdaQueryWrapper<Menu> wrapper = new LambdaQueryWrapper<>();
            wrapper.in(Menu::getMenuType, SystemConstants.MENU, SystemConstants.BUTTON);
            wrapper.eq(Menu::getStatus, SystemConstants.STATUS_NORMAL);
            List<Menu> menus = list(wrapper);
            List<String> perms = menus.stream()
                    .map(Menu::getPerms)
                    .collect(Collectors.toList());
            return perms;
        }
        //否则返回所具有的权限
        return getBaseMapper().selectPermsByUserId(id);
    }

    @Override
    public List<Menu> selectRouterMenuTreeByUserId(Long userId) {
        return null;
    }

    @Override
    public List<Menu> selectMenuList(Menu menu) {
        return null;
    }

    @Override
    public boolean hasChild(Long menuId) {
        return false;
    }

    @Override
    public List<Long> selectMenuListByRoleId(Long roleId) {
        return null;
    }
}
