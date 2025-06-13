package com.example.test_reponsebody;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    //@ResponseBody
    public String hello(){
        return "Hello World";
    }
}
