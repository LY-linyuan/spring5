package com.bjpowernode.service.impl;

import com.bjpowernode.dao.StudentDao;
import com.bjpowernode.domain.Student;
import com.bjpowernode.service.StudentService;

import java.util.List;

/**
 * @Author 临渊
 * @Date 2022-07-31 9:22
 */
public class StudentServiceImpl implements StudentService {

    // 引用类型dao
    private StudentDao studentDao;

    // 目的是使用set注入来赋值
    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public int addStudent(Student student) {
        int i = studentDao.insertStudent(student);
        return i;
    }

    @Override
    public List<Student> queryStudents() {
        List<Student> studentList = studentDao.selectStudents();
        return studentList;
    }
}
