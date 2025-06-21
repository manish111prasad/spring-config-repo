package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class TestController {

    // Handling POST request with RequestBody (for JSON data)
    @PostMapping("/myMethod-post")
    public String myMethodPost(@RequestParam(required = false) String param1, 
                               @RequestParam(required = false) String param2) {
        
        System.out.println("Running myMethod() with params: " + param1 + " + " + param2);
        
        return "hello world-post|param1:"+param1+"+"+param2;
    }

    // Handling GET request
    @GetMapping("/myMethod")
    public String myMethod() {
        System.out.println("Running myMethod()");
        return "Hello World";
    }
}
