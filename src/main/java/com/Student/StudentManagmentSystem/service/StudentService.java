package com.Student.StudentManagmentSystem.service;

import com.Student.StudentManagmentSystem.entity.Student;

import java.util.List;

public interface StudentService {
    Student createStudent(Student student);
    List<Student>getAllStudent();
    Student getStudentById(Long Id);
    Student updateStudent(Long id,Student student);
    void deleteStudent(Long id);

}
