package com.breamer.demo.dao.secondary;

import com.breamer.demo.entity.secondary.Student;

import java.util.List;

/**
 * @author breamer
 * @Description:
 * @date 2018/7/25 14:27
 */
public interface StudentDAO{
    /**
     * 用户列表
     * @author zhang.penghao
     * @date 2018/7/11 11:33
     * @return list
     */
    List<Student> studentList();

    /**
     * 添加用户
     * @author zhang.penghao
     * @date 2018/7/11 11:33
     * @param Student 用户
     * @return int
     */
    int addStudent(Student Student);
}
