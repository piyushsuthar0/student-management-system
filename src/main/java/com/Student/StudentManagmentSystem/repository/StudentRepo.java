package com.Student.StudentManagmentSystem.repository;

import com.Student.StudentManagmentSystem.entity.Student;
import com.Student.StudentManagmentSystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student,Long> {

}
