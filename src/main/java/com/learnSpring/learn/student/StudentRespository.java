package com.learnSpring.learn.student;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRespository extends JpaRepository<Student, Integer> {

    Student findByEmail(String email);
    Student deleteByEmail(String email);
}
