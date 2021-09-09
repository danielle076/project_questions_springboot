package com.danielle.demo_springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

    @GetMapping(value = "/")
    public String sayHello() {
        return "Hello World!";
    }

    @GetMapping(value = "/danielle")
    public String sayDanielle() {
        return "Hello Danielle!";
    }

    @GetMapping("/name")
    public String getName(@RequestParam(required = false) String name) {
        if (name == null) {
            return "Hello you!";
        } else {
            return "Hello " + name + "!";
        }
    }
}