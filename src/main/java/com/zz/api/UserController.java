package com.zz.api;

import com.zz.domain.User;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.*;

/**
 * Created by ZackZhou on 2018/5/30.
 */
@RestController
@RequestMapping("/api/users")
public class UserController {
    // 创建线程安全的Map
    static ArrayList<User> users = new ArrayList<User>();
    private Long id;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<User> getUsers(){
        return users;
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public User createUser(@RequestBody User input){
        users.add(input);
        System.out.println(users);
        return input;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User getUserbyId(@PathVariable(value = "id") Long id) {
        System.out.println("Query id is " + id);
        User user = null;
        for (User item: users) {
            System.out.println(id + ", " + item.getId());
            if (id == item.getId()) {
                user = item;
                break;
            }
        }
        return user;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public User updateUserbyId(@PathVariable(value = "id") Long id, @RequestBody User body) {
        User user = getUserbyId(id);
        user.setAge(body.getAge());
        return user;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String deleteUserById(@PathVariable(value = "id") Long id) {
        for (User item : users) {
            System.out.println(id + ", " + item.getId());
            if (id == item.getId()) {
                users.remove(item);
                break;
            }
        }
        return "User " + id + " is deleted";
    }
}
