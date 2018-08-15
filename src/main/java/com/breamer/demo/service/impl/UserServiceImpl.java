package com.breamer.demo.service.impl;

import com.breamer.demo.dao.primary.UserDAO;
import com.breamer.demo.entity.primary.User;
import com.breamer.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户业务实现
 * @author zhang.penghao
 * @date 2018/7/11 17:16
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDAO userDao;

    @Override
    public List<User> userList() {
        return userDao.userList();
    }

    @Override
    public User getUserById(Integer id) {
        return userDao.getUserById(id);
    }

    @Override
    public int addUser(User user) {
        return userDao.addUser(user);
    }
}
