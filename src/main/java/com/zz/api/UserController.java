package com.zz.api;

import com.zz.domain.User;
import com.zz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.*;

/**
 * Created by ZackZhou on 2018/5/30.
 */
@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;

    // 创建线程安全的Map
    static ArrayList<User> users = new ArrayList<User>();
    private Long id;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<User> getUsers(){
        List<User> userList = userService.getUsers();
        return userList;
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public User createUser(@RequestBody User input){
        userService.createUser(input);
        return userService.getUserById(input.getId());
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User getUserbyId(@PathVariable(value = "id") Long id) {
        System.out.println("Query id is " + id);
        return userService.getUserById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public User updateUserbyId(@PathVariable(value = "id") Long id, @RequestBody User body) {
        User user = userService.getUserById(id);
        // Todo: judge null user
        if (body.getAge() != null) {
            user.setAge(body.getAge());
        }
        if (body.getName() != null) {
            user.setName(body.getName());
        }

        userService.updateUserById(user);
        return null;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String deleteUserById(@PathVariable(value = "id") Long id) {
        userService.deleteById(id);
        return "User " + id + " is deleted";
    }
}
