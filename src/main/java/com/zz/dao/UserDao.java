package com.zz.dao;

import com.zz.domain.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by zhouxf on 2018/6/7.
 */
public interface UserDao {
    User getUserById(@Param("id") Long id);
    List<User> getUsers();
    void createUser(User user);
    void updateUserById(User user);
    void deleteUserById(Long id);
}
