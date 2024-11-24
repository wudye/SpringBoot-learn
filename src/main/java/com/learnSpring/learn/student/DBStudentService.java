package com.learnSpring.learn.student;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class DBStudentService implements StudenService {
    private final StudentRespository studentRespository;
    public DBStudentService(StudentRespository studentRespository) {
        this.studentRespository = studentRespository;
    }

    @Override
    public Student save(Student student) {
        return studentRespository.save(student);
    }

    @Override
    public List<Student> findAllStudent() {
        return studentRespository.findAll();
    }

    @Override
    public Student findByEmail(String email) {

        return studentRespository.findByEmail(email);
    }

    @Override
    public void deleteStudent(String email) {
        studentRespository.deleteByEmail(email);
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRespository.save(student);
    }
}
