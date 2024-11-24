package org.demo.springwebwithk8s.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RestController
    public class HelloController {
        @GetMapping("/")
        public String sayHello() {
            return "Hello world!";
        }
    }
}
