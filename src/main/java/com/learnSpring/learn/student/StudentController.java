package com.learnSpring.learn.student;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/student")
public class StudentController {
    @GetMapping
    public List<String> findAllStudent() {
        return  List.of(
                "hello",
                "it is mwu"
        );
    }
}
