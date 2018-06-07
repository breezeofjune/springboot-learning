package com.zz.exceptions;

/**
 * Created by zhouxf on 2018/6/6.
 */
public enum RequestError {
    CLASS_NOT_FOUND(101,"class not found");
    private Integer code;
    private String message;

    private RequestError(Integer code, String message){
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
