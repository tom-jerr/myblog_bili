package com.uestclzy.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.uestclzy.domain.entity.Menu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author lzy
 * @version 1.0.0
 * 2023/2/27 21:46
 */
@Mapper
public interface MenuMapper extends BaseMapper<Menu> {
    List<String> selectPermsByUserId(Long userId);
}
