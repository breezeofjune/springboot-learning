package com.zz.api;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.zz.exceptions.CheckedException;
import com.zz.exceptions.MyException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Created by zhouxf on 2018/6/6.
 */
@RestControllerAdvice(basePackages = "com.zz.api")
public class RestExceptionhandler {
    @ExceptionHandler(value = MyException.class)
    public ResponseEntity<RetException> handleMyException(MyException e) {
        return new ResponseEntity<RetException>(new RetException(e), HttpStatus.BAD_REQUEST);
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static final class RetException{
        private Integer code;
        private String msg;

        public RetException(CheckedException e) {
            this.code = e.getCode();
            this.msg = e.getMessage();
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
}
