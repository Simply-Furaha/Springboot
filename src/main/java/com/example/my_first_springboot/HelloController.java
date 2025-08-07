package com.example.my_first_springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String home(){
        return "Hello Guys it's been great having you around";
    }

    @GetMapping("/bye")
    public String bye(){
        return "I just want to wish you a success and hopefully we meet in a professional setting";
    }

    @GetMapping("/greet/{name}")
    public String greet(@PathVariable String name){
        return "Hello "+name+"!";
    }

    //Assingment End Points

}
