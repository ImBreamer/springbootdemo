package com.breamer.demo.controller;

import com.breamer.demo.entity.secondary.Student;
import com.breamer.demo.service.StudentService;
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
 * @author breamer
 * @Description:
 * @date 2018/7/25 14:49
 */
@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value="/list", method=RequestMethod.GET)
    public Map<String, Object> listStudent() {
        List<Student> students = studentService.studentList();

        Map<String, Object> result = new HashMap<>(16);
        result.put("status",true);
        result.put("msg","success");
        result.put("data",students);
        return result;
    }

    @RequestMapping(value="/add", method=RequestMethod.POST)
    @Transactional(rollbackFor = Exception.class, value = "secondaryTransactionManager")
    public Map<String, Object> addStudent(@ModelAttribute Student student) {
        boolean insertResult = studentService.addStudent(student) > 0 ? true : false;

        Map<String, Object> result = new HashMap<>(16);
        result.put("status",insertResult);
        result.put("msg",insertResult ? "success" : "fail");
        if(true){
            throw new RuntimeException("hello rollback");
        }
        return result;
    }

    @RequestMapping(value="/addReal", method=RequestMethod.POST)
    public Map<String, Object> addStudentReal(@ModelAttribute Student student) {
        boolean insertResult = studentService.addStudent(student) > 0 ? true : false;

        Map<String, Object> result = new HashMap<>(16);
        result.put("status",insertResult);
        result.put("msg",insertResult ? "success" : "fail");
        return result;
    }
}
