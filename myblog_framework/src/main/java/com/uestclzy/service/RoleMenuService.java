package com.uestclzy.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.uestclzy.domain.entity.RoleMenu;

/**
 * @author lzy
 * @version 1.0.0
 * 2023/4/13 23:11
 */
public interface RoleMenuService extends IService<RoleMenu> {
    void deleteRoleMenuByRoleId(Long id);
}
