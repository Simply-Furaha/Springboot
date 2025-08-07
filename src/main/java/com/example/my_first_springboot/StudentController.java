package com.example.my_first_springboot;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/student")
    public String student(){
        return "This is a Student Management System";
    }

    @GetMapping("/student/count")
    public String studentCount(){
        return "Total Number of students is 177";
    }

    @GetMapping("/student/{id}")
    public String student(@PathVariable String id){
        return "Student with "+id+" was found";
    }

    @GetMapping("/student/{name}/{course}")
    public String studentWelcome(@PathVariable String name, @PathVariable String course){
        return "Hello "+name+", Welcome to  "+course+" class";
    }

}
