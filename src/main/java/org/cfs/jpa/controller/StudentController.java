package org.cfs.jpa.controller;

import org.cfs.jpa.entity.Student;
import org.cfs.jpa.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentRepo studentRepo;

    StudentController(StudentRepo studentRepo){
        this.studentRepo=studentRepo;
    }

    @PostMapping
    public Student createStudent(@RequestBody Student student){
        return  studentRepo.save(student);
    }
    @GetMapping
    public List<Student> getAllStudents(){
        return studentRepo.findAll();
    }
    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable Long id, @RequestBody Student student){
        Student s = studentRepo.findById(id)
                .orElseThrow(()-> new RuntimeException("Student not found0"));
        s.setName(student.getName());
        s.setEmail(student.getEmail());
        return studentRepo.save(student);
    }
    @PatchMapping("/{id}/name")
    public Student patchStudent(@PathVariable Long id, @RequestParam String  name){
        Student s = studentRepo.findById(id)
                .orElseThrow(()-> new RuntimeException("Student not find"));
        s.setName(name);
        return studentRepo.save(s);
    }
    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable Long id){
        Student s = studentRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found"));
        studentRepo.delete(s);
        return "Student deleted Successfully";
    }
}
