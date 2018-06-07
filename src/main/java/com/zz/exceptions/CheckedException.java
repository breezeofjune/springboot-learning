package com.zz.exceptions;

/**
 * Created by zhouxf on 2018/6/6.
 */
public class CheckedException extends Exception{
    private Integer code;
    private String msg;

    CheckedException(Integer code, String msg) {
        super(msg);
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
