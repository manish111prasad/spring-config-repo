package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

import com.example.demo.MyNumObject;

@RestController
@RequestMapping("/api")
public class MyController {

    private MyNumObject obj = new MyNumObject(5, 10); // Default values

    @GetMapping("/numbers")
    public MyNumObject getNumbers() {
        return obj;
    }

    @PostMapping("/numbers")
    public MyNumObject createNumber(@RequestBody MyNumObject newObj) {
        this.obj = newObj; // Store only the latest object
        return obj;
    }
}

