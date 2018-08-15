package com.breamer.demo.service;

import com.breamer.demo.entity.primary.User;
import com.breamer.demo.entity.secondary.Student;

import java.util.List;

/**
 * @author breamer
 * @Description:
 * @date 2018/7/25 14:45
 */
public interface StudentService {
    List<Student> studentList();
    /**
     * 功能描述:
     * @author zhang.penghao
     * @date 2018/7/11 17:04
     * @param student 用户
     * @return int
     */
    int addStudent(Student student);
}
