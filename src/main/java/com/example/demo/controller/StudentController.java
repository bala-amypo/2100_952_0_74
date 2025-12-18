package com.example.demo.controller;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;
@RestController
public class StudentController{
    @Autowired
    StudentService stdser;
    @PostMapping("/addStudent")
    public Student addStudent(@RequestBody Student st){
        return stdser.poststudent(st);
    }
    @GetMapping("/displayStudent")
    public List<Student> displayStudent(){
        return stdser.getAllStudent();
    }
    @GetMapping("/getStudent/{id}")
    public Optional<Student> getStudent(@PathVariable Long id){
        return stdser.getById(id);
    }
    @PutMapping("/update/{id}")
    public String update(@PathVariable Long id, @RequestBody Student st){
    return stdser.updateData(id,st);
    }
}