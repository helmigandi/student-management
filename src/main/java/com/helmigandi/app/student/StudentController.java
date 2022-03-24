package com.helmigandi.app.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/students")
public class StudentController {

    @GetMapping
    public List<Student> getAllStudents() {
        return List.of(
                new Student(1L, "Andi Rahmat", "andi31@mail.com", Gender.MALE),
                new Student(2L, "Suryani", "yans9@mail.com", Gender.FEMALE),
                new Student(3L, "Anthony", "anthonz@mail.com", Gender.OTHER)
        );
    }
}
