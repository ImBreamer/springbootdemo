package com.breamer.demo.controller;

import com.breamer.demo.entity.primary.User;
import com.breamer.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 用户控制器
 * @author zhang.penghao
 * @date 2018/7/11 16:28
 */
@RestController
@RequestMapping(value="/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value="/list", method=RequestMethod.GET)
    public Map<String, Object> listUsers() {
        List<User> users = userService.userList();
        //int i = 1/0;
        Map<String, Object> result = new HashMap<>(16);
        result.put("status",true);
        result.put("msg","success");
        result.put("data",users);

        return result;
    }

    @RequestMapping(value="/add", method=RequestMethod.POST)
    @Transactional(rollbackFor = Exception.class, value = "primaryTransactionManager")
    public Map<String, Object> addUser(@ModelAttribute User user) {
        boolean insertResult = userService.addUser(user) > 0 ? true : false;

        Map<String, Object> result = new HashMap<>(16);
        result.put("status",insertResult);
        result.put("msg",insertResult ? "success" : "fail");
        if(true){
            throw new RuntimeException("hello rollback");
        }
        return result;
    }

    @RequestMapping(value="/addReal", method=RequestMethod.POST)
    public Map<String, Object> addUserReal(@ModelAttribute User user) {
        boolean insertResult = userService.addUser(user) > 0 ? true : false;

        Map<String, Object> result = new HashMap<>(16);
        result.put("status",insertResult);
        result.put("msg",insertResult ? "success" : "fail");
        return result;
    }
}
