package com.example.threstcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "Hello World";
    }
    @GetMapping("/hello/Vietnamese")
    public String hello2(){
        return "xin chao";
    }

}
