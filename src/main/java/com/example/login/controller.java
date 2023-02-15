package com.example.login;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    @GetMapping("/")
    public String home(){
        return "<h1>This is home page</h1>";
    }

    @GetMapping("/user")
    public String user(){
        return "<h1>This is User page</h1>";
    }

    @GetMapping("/admin")
    public String admin(){
        return "<h1>This is Admin page</h1>";
    }
}
