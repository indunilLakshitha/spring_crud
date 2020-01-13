package com.example.demo3.contollers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//this is only for testing
@RestController
@RequestMapping("/test")
public class test {

    @GetMapping("/one")
    private String test(){
        return "test success";
    }
}
