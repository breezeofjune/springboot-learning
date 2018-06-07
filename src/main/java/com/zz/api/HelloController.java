package com.zz.api;

import com.zz.exceptions.MyException;
import com.zz.exceptions.RequestError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by ZackZhou on 2018/5/30.
 */
@RestController
@RequestMapping("/api")
public class HelloController {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(){
        return "Hello, springboot";
    }

    @RequestMapping(value = "hello/ex")
    public  String helloEx() throws MyException {
        throw new MyException(RequestError.CLASS_NOT_FOUND);
    }

}
