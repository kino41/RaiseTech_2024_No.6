package com.RaiseTech6.HelloWorld;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }

    @DeleteMapping("/hello")
    public String deletehello() {
        return "Delete Hello";
    }

}
