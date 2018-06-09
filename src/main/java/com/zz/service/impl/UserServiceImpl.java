package com.zz.service.impl;

import com.zz.dao.UserDao;
import com.zz.domain.User;
import com.zz.service.UserService;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhouxf on 2018/6/7.
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Long id) {
        return userDao.getUserById(id);
    }

    @Override
    public List<User> getUsers() {return userDao.getUsers();}

    @Override
    public void createUser(User user) {
        userDao.createUser(user);
    }

    @Override
    public void updateUserById(User user) {
        userDao.updateUserById(user);
    }

    @Override
    public void deleteById(Long id) {
        userDao.deleteUserById(id);
    }
}
