package com.uestclzy.exception;

import com.uestclzy.enums.AppHttpCodeEnum;

/**
 * @author lzy
 * @version 1.0.0
 * 2023/2/8 17:54
 */
public class SystemException extends RuntimeException{
    private int code;

    private String msg;

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public SystemException(AppHttpCodeEnum httpCodeEnum) {
        super(httpCodeEnum.getMsg());
        this.code = httpCodeEnum.getCode();
        this.msg = httpCodeEnum.getMsg();
    }
}
