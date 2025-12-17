package com.example.StudentProject.entity;

import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
public class Student {
    @Id
    private Long id;
    private String name;
    private String dept;
    private float cgpa;
    private LocalDate dob;
    public int getId(){
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDept() {
        return dept;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }
    public float getCgpa() {
        return cgpa;
    }
    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }
    public LocalDate getDob() {
        return dob;
    }
    public void setDob(LocalDate dob) { 
        this.dob = dob;
    }
    public Student(){

    }
    public Student(Long id, String name, String dept, float cgpa, LocalDate dob) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.cgpa = cgpa;
        this.dob = dob;
    }
}

