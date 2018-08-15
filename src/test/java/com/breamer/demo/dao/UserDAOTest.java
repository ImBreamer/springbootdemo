package com.breamer.demo.dao;

import com.breamer.demo.dao.primary.UserDAO;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDAOTest {
    @Autowired
    private UserDAO userDao;
    @Test
    public void userList() {
        assertEquals(2,userDao.userList().size());
    }

    @Test
    @Ignore
    public void getUserById() {
        System.out.println("---------------------------------------------------------");
         System.out.println(userDao.getUserById(1).getUserName());
    }

    @Test
    @Ignore
    public void addUser() {
    }

    @Test
    @Ignore
    public void updateUser() {
    }

    @Test
    @Ignore
    public void deleteUserById() {
    }
}