package com.example.testcc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    @GetMapping("/test")
    public String test(){
        return "test appln";
    }
}
