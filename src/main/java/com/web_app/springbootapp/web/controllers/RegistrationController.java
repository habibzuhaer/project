package com.web_app.springbootapp.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/register")
public class RegistrationController {
    @GetMapping
    public String preparepRegistrationPage() {
        return "/WEB-INF/views/registration-page.jsp";
    }

    @PostMapping
    public String processRegistrationPage() {
        // TODO
        return "";
    }

}