package com.ejemploGroovy.ejemploGroovy.service

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController;

//@Component
@RestController
class HelloWorldService {

    //@Value("${name:World}")
    private String name;

    @RequestMapping("/")
    public String getHelloMessage() {
        return "Hello " + this.name;
    }

}