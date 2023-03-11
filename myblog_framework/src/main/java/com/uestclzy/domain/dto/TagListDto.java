package com.uestclzy.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author lzy
 * @version 1.0.0
 * 2023/3/11 20:10
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TagListDto {

    private String name;
    private String remark;
}