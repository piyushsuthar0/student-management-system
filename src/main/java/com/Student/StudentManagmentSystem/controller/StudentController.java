package com.Student.StudentManagmentSystem.controller;

import com.Student.StudentManagmentSystem.entity.Student;
import com.Student.StudentManagmentSystem.service.StudentService;
import com.Student.StudentManagmentSystem.service.StudentServiceImp;
import jakarta.persistence.GeneratedValue;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {
    private final StudentService studentService;
    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(StudentServiceImp.class);


    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    @PostMapping
    public Student createStudent(  @Valid @RequestBody Student student){

        log.info("Creating Student with name {}",student.getName());
        return studentService.createStudent(student);
    }
    @GetMapping
    public List<Student> getAllStudent(){
        return studentService.getAllStudent();
    }
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Long id) {
        log.info("Fetching student with id {}", id);
        return studentService.getStudentById(id);
    }

    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable Long id, @Valid  @RequestBody Student student) {
        return studentService.updateStudent(id, student);
    }

    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
        return "Student deleted with id: " + id;
    }

}
