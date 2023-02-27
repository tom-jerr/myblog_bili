package com.uestclzy.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.uestclzy.domain.ResponseResult;
import com.uestclzy.domain.entity.Role;


import java.util.List;

/**
 * @author lzy
 * @version 1.0.0
 * 2023/2/27 21:58
 */
public interface RoleService extends IService<Role> {

    List<String> selectRoleKeyByUserId(Long id);

//    ResponseResult selectRolePage(Role role, Integer pageNum, Integer pageSize);
//
//    void insertRole(Role role);
//
//    void updateRole(Role role);
//
//    List<Role> selectRoleAll();
//
//    List<Long> selectRoleIdByUserId(Long userId);
}
