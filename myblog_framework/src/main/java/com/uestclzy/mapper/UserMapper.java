package com.uestclzy.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.uestclzy.domain.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author lzy
 * @version 1.0.0
 * 2022/11/22 0:14
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
