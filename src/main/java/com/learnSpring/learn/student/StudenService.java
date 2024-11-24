package com.learnSpring.learn.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudenService {

    public List<Student> findAllStudent() {
        return List.of(
                new Student("wmm", "mm", LocalDate.now(), "aa@mail.com", 22),
                new Student("bb", "bb", LocalDate.now(), "bb@mail.com", 12),
        new Student("cccc", "cc", LocalDate.now(), "cc@mail.com", 32)

        );
    }
}
