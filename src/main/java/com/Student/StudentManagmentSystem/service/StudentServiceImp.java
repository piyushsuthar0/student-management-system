package com.Student.StudentManagmentSystem.service;

import com.Student.StudentManagmentSystem.Config.ResourceNotFoundException;
import com.Student.StudentManagmentSystem.entity.Student;
import com.Student.StudentManagmentSystem.repository.StudentRepo;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImp implements StudentService{

    private final StudentRepo studentRepo;
    private static final Logger log = LoggerFactory.getLogger(StudentServiceImp.class); // ✅ added

    public StudentServiceImp(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }


    @Override
    public Student createStudent(  Student student) {
        log.debug("Saving student: {}", student);
        return studentRepo.save(student);
    }

    @Override
    public List<Student> getAllStudent() {
        return studentRepo.findAll();
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Student not found with id " + id));
    }

    @Override
    public Student updateStudent(Long id,   Student updateStudent) {
        Student student = getStudentById(id);
        student.setName(updateStudent.getName());
        student.setEmail(updateStudent.getEmail());
        student.setAge(updateStudent.getAge());
        student.setDepartment(updateStudent.getDepartment());
        return studentRepo.save(student);
    }

    @Override
    public void deleteStudent(Long id) {
        studentRepo.deleteById(id);

    }
}
