package com.zz.domain;

import java.io.Serializable;

/**
 * Created by ZackZhou on 2018/5/30.
 */
public class User implements Serializable {
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    private Long id;
    private String name;
    private Integer age;


    public User(Long id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public User() {}

    @Override
    public String toString() {
        return "User[name=" + name + ", age=" + age + "]";
    }

}
