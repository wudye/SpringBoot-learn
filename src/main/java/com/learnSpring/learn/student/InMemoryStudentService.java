package com.learnSpring.learn.student;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class InMemoryStudentService implements StudenService{

    private final InMemoryStudenDAO inMemoryStudenDAO;
    @Autowired
    public InMemoryStudentService(InMemoryStudenDAO inMemoryStudenDAO) {
        this.inMemoryStudenDAO = inMemoryStudenDAO;
    }

    @Override
    public boolean save(Student student) {
        return inMemoryStudenDAO.save(student);
    }

    @Override
    public List<Student> findAllStudent() {
        return inMemoryStudenDAO.findAllStudent();
    }

    @Override
    public Student findByEmail(String email) {
        return inMemoryStudenDAO.findByEmail(email);
    }

    @Override
    public void deleteStudent(String email) {
        inMemoryStudenDAO.deleteStudent(email);
    }

    @Override
    public Student updateStudent(Student student) {
        return inMemoryStudenDAO.updateStudent(student);
    }
}