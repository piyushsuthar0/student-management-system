package com.Student.StudentManagmentSystem.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentDTO {
    private Long id;
    private String name;
    private String Email;
    private String department;
    private int age;

}
