package com.sid.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootTestController {

    @RequestMapping(method = RequestMethod.GET,path = "/hello")
    public String test(){
        return "Hello World";
    }
}
