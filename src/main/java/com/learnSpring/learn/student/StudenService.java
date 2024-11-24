package com.learnSpring.learn.student;

import java.util.List;


public interface StudenService {

    Student save(Student student);
    public List<Student> findAllStudent() ;
    Student findByEmail(String email);
    void deleteStudent(String email);
    Student updateStudent(Student student);

}
