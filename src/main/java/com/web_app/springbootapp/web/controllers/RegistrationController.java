package com.web_app.springbootapp.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/register")
public class RegistrationController {
    @GetMapping
    public String preparepRegistration() {
        return "/WEB-INF/views/registration.jsp";
    }

    @PostMapping
    public String processRegistration() {
        // TODO
        return "";
    }

}