package com.clianz.demo.async.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/")
public class WebController {

    @Autowired
    private SomeService someService;

    @GetMapping("/")
    public String hello() {
        LocalDateTime now = LocalDateTime.now();
        someService.doSomething(now.toLocalTime()
                .toString());
        return "hello " + now;
    }

}
