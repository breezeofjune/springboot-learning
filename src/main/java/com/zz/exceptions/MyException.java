package com.zz.exceptions;

/**
 * Created by zhouxf on 2018/6/6.
 */
public class MyException extends CheckedException{
    public MyException(RequestError requestError) {
        super(requestError.getCode(), requestError.getMessage());
    }
}
