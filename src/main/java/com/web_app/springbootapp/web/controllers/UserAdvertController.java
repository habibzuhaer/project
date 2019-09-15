package com.web_app.springbootapp.web.controllers;

import com.web_app.springbootapp.model.entities.Advert;
import com.web_app.springbootapp.model.repositories.AdvertRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;
import java.util.List;

@Controller
@RequestMapping("/user-adverts")
public class UserAdvertController {

    private AdvertRepository advertRepository;

    public UserAdvertController(AdvertRepository advertRepository) {
        this.advertRepository = advertRepository;
    }

    @GetMapping
    public String prepareUserAdvertsController (Principal principal, Model model) {
        String username = principal.getName();
        List<Advert> adverts = advertRepository.findAllByOwner_Username(username);
        model.addAttribute("adverts", adverts);
        return "user-adverts";
    }


}
