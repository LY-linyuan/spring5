package com.bjpowernode.service;

import com.bjpowernode.domain.Student;

import java.util.List;

/**
 * @Author 临渊
 * @Date 2022-07-31 9:20
 */
public interface StudentService {
    int addStudent(Student student);
    List<Student> queryStudents();
}
