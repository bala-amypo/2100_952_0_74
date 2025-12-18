package com.example.demo.service;

import com.example.demo.entity.Student;
import java.util.List;
public interface StudentService{
    Student poststudent(Student st);
    List<Student> getAllStudent();
    Student getById(Long id);
}
