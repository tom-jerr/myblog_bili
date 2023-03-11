package com.uestclzy.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.uestclzy.domain.entity.Menu;
import com.uestclzy.domain.entity.Role;

import java.util.List;

/**
 * @author lzy
 * @version 1.0.0
 * 2023/2/27 22:00
 */
public interface RoleMapper extends BaseMapper<Role> {

    List<String> selectRoleKeyByUserId(Long userId);

    List<Long> selectRoleIdByUserId(Long userId);

}
