package com.cognizant.spring_learn.controller;

import org.slf4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private static Logger LOGGER = org.slf4j.LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/hello")
    public String sayHello(){
        LOGGER.info("Inside sayHello method");
        return "Hello World!!";
    }

}
