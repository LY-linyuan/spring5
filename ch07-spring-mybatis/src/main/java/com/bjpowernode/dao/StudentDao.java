package com.bjpowernode.dao;

import com.bjpowernode.domain.Student;

import java.util.List;

/**
 * @Author 临渊
 * @Date 2022-07-31 9:07
 */
public interface StudentDao {
    int insertStudent(Student student);

    List<Student> selectStudents();


}
