package com.example.lab7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
public class StudentController {

    @Autowired
    MysqlConnector sqlConnector;

    @GetMapping("/student")
    public List<Student> index(){
        return (List<Student>) sqlConnector.findAll();
    }

    @GetMapping("/student/{id}")
    public Optional<Student> show(@PathVariable String id){
        int studentId = Integer.parseInt(id);
        return sqlConnector.findById(studentId);
    }

    @PostMapping("/student")
    public Student create(@RequestBody Map<String, String> body){
        int id = Integer.parseInt(body.get("id"));
        String name = body.get("name");
        String school = body.get("school");
        String major = body.get("major");
        int gpa = Integer.parseInt(body.get("gpa"));
        return sqlConnector.save(new Student(id, name, school, major, gpa));
    }

    @PutMapping("/student/{id}")
    public Student update(@PathVariable String id, @RequestBody Map<String, String> body){
        int StudentId = Integer.parseInt(id);
        String name = body.get("name");
        String school = body.get("school");
        String major = body.get("major");
        int gpa = Integer.parseInt(body.get("gpa"));
        return sqlConnector.save(new Student(StudentId, name, school, major, gpa));
    }

    @DeleteMapping("Student/{id}")
    public boolean delete(@PathVariable String id){
        int StudentId = Integer.parseInt(id);
        sqlConnector.deleteById(StudentId);
        return true;
    }

}
