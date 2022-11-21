package com.uestclzy.domain.vo;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author lzy
 * @version 1.0.0
 * 2022/11/22 0:08
 */
@Data
@Accessors(chain = true)
public class UserInfoVo {
    /**
     * 主键
     */
    private Long id;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 头像
     */
    private String avatar;

    private String sex;

    private String email;


}
