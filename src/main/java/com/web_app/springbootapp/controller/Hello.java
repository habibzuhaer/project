package com.web_app.springbootapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Hello {
    @RequestMapping("/")
    @ResponseBody
    String hello() {
        return "Hello World !";
    }
}
