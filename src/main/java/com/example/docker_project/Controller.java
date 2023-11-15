package com.example.docker_project;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
    @GetMapping("/")
    public String home()
    {
        return "<h1>hello world!</h1>";
    }
}
