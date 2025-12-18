package com.example.demo.entity;
import java.time.LocalDate;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message="Name is not valid")
    private String name;
    private String dept;
    private float cgpa;
    @PastOrPresent
    private LocalDate dob;
    public Long getId(){
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

