package com.learnSpring.learn.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    private final StudenService inMemoryStudentService;
    @Autowired
    public StudentController(StudenService studenService) {
        this.inMemoryStudentService = studenService;
    }

    @GetMapping
    public List<Student> findAllStudent() {
        return inMemoryStudentService.findAllStudent();
    }

    @PostMapping
    public Student saveStudent(@RequestBody Student student) {
        return inMemoryStudentService.save(student);
    }

    @GetMapping("/{email}")
    public Student findStudentByEmail(@PathVariable String email) {
        return inMemoryStudentService.findByEmail(email);
    }

    @PutMapping()
    public Student updateStudent(@RequestBody Student student) {
        return inMemoryStudentService.updateStudent(student);
    }

    @DeleteMapping("/{email}")
    public void deleteStudent(@PathVariable String email) {
        inMemoryStudentService.deleteStudent(email);
    }
}
