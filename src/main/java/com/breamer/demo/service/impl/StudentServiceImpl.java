package com.breamer.demo.service.impl;

import com.breamer.demo.dao.secondary.StudentDAO;
import com.breamer.demo.entity.secondary.Student;
import com.breamer.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author breamer
 * @Description:
 * @date 2018/7/25 15:44
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDAO studentDao;

    @Override
    public List<Student> studentList(){
        return studentDao.studentList();
    }

    @Override
    public int addStudent(Student student) {
        return studentDao.addStudent(student);
    }


}
