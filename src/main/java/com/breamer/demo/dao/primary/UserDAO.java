package com.breamer.demo.dao.primary;

import com.breamer.demo.entity.primary.User;

import java.util.List;

/**
 * 用户DAO
 * @author zhang.penghao
 * @date 2018/7/11 16:55
 */
public interface UserDAO {
     /**
      * 用户列表
      * @author zhang.penghao
      * @date 2018/7/11 11:33
      * @return list
      */
     List<User> userList();

     /**
      * 用户信息
      * @author zhang.penghao
      * @date 2018/7/11 11:33
      * @param id 用户id
      * @return User
      */
     User getUserById(Integer id);

     /**
      * 添加用户
      * @author zhang.penghao
      * @date 2018/7/11 11:33
      * @param user 用户
      * @return int
      */
     int addUser(User user);
//     int updateUser(User user);
//     int deleteUserById(Integer id);

}
