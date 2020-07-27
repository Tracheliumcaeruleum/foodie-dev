package com.imooc.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hellocontroller {

    @GetMapping("/hello")
    public  Object hello(){
        return "HEllo";
    }
}
