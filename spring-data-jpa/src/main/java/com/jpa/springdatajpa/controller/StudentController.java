package com.jpa.springdatajpa.controller;

import com.jpa.springdatajpa.entity.Student;
import com.jpa.springdatajpa.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping ("/create")
    public Student createStudent(@RequestBody Student student) {
        Student response = studentService.save(student);
        return response;
    }

    @GetMapping ("/allstudents")
    public List<Student> getStudents() {
        List<Student> getReponse = studentService.getStudents();
        return getReponse;
    }
}
