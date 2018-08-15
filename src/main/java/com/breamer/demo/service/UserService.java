package com.breamer.demo.service;

import com.breamer.demo.entity.primary.User;

import java.util.List;

/**
 * 用户业务接口
 * @author zhang.penghao
 * @date 2018/7/11 16:56
 */
public interface UserService {
    /**
     * 功能描述:
     * @author zhang.penghao
     * @date 2018/7/11 16:56
     * @return List
     */
    List<User> userList();

    /**
     * 功能描述:
     * @author zhang.penghao
     * @date 2018/7/11 17:03
     * @param id 用户ID
     * @return User
     */
    User getUserById(Integer id);

    /**
     * 功能描述:
     * @author zhang.penghao
     * @date 2018/7/11 17:04
     * @param user 用户
     * @return int
     */
    int addUser(User user);
}
