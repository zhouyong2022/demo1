package com.example.demo1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/test")
    public String test() {
        return "OK";
    }

    @RequestMapping("/test2")
    public String test2() {
        return "OK2";
    }

    @RequestMapping("/test3")
    public String test3() {
        return "OK3";
    }

}
