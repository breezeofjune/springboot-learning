package com.zz.service;

import com.zz.domain.User;

import java.util.List;

/**
 * Created by zhouxf on 2018/6/7.
 */
public interface UserService {
    User getUserById(Long id);

    List<User> getUsers();

    void createUser(User user);
    void updateUserById(User user);
    void deleteById(Long id);
}
