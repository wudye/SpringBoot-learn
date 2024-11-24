package com.learnSpring.learn.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/v1/student")
public class StudentController {

    // without injection
    //private StudenService  studenService = new StudenService();

    // file injection
   // @Autowired
    // private StudenService studenService;
    // constructor injection
    private StudenService studenService;
    @Autowired
    public StudentController(StudenService studenService) {
        this.studenService = studenService;
    }

    @GetMapping
    public List<Student> findAllStudent() {
        return studenService.findAllStudent();
    }
}
