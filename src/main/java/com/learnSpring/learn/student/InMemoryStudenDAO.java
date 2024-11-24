package com.learnSpring.learn.student;


import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class InMemoryStudenDAO {

    private final List<Student> students = new ArrayList<Student>();


    public boolean save(Student student) {
        return students.add(student);
    }


    public List<Student> findAllStudent() {
        return students;
    }

    public Student findByEmail(String email) {
        return students.stream()
                .filter(s->email.equals(s.getEmail()))
                .findFirst()
                .orElse(null);
    }


    public void deleteStudent(String email) {
        var student = findByEmail(email);
        if (student != null) {
            students.remove(student);
        }
    }

    public Student updateStudent(Student student) {
        var studentIndex = IntStream.range(0, students.size())
                .filter(index ->students.get(index).getEmail().equals(student.getEmail()))
                .findFirst()
                .orElse(-1);
        if (studentIndex != -1) {
            students.set(studentIndex, student);
        }
        return null;
    }




}
