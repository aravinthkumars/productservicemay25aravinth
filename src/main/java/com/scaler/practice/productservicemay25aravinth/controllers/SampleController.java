package com.scaler.practice.productservicemay25aravinth.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sample")
public class SampleController {

    //@DeleteMapping("/sayHello")
    @GetMapping("/sayHello/{name}")
    public String sayHello(@PathVariable("name") String strName){
        return "Hello "+strName;
    }

    @GetMapping("/sayHello2")
    public String sayHello2(@RequestParam("x") int x){
        return "Hello World2! " + x;
    }
}
