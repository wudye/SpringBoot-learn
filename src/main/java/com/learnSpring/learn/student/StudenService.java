package com.learnSpring.learn.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;


public interface StudenService {

    boolean save(Student student);
    public List<Student> findAllStudent() ;
    Student findByEmail(String email);
    void deleteStudent(String email);
    Student updateStudent(Student student);

}
