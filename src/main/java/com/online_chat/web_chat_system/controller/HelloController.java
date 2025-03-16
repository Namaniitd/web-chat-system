package com.online_chat.web_chat_system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api") 
public class HelloController {

    @GetMapping("/hello")
    public String getHello(){
        return "Hello World";
    }
}
