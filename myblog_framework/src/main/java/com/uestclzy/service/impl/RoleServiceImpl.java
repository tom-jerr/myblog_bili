package com.uestclzy.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.uestclzy.domain.entity.Role;
import com.uestclzy.mapper.RoleMapper;
import com.uestclzy.service.RoleService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


/**
 * @author lzy
 * @version 1.0.0
 * 2023/2/27 22:01
 */
@Service("roleService")
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements RoleService {

    @Override
    public List<String> selectRoleKeyByUserId(Long id) {
        //判断是否是管理员 如果是返回集合中只需要有admin
        if(id == 1L){
            List<String> roleKeys = new ArrayList<>();
            roleKeys.add("admin");
            return roleKeys;
        }
        //否则查询用户所具有的角色信息
        return getBaseMapper().selectRoleKeyByUserId(id);
    }
}