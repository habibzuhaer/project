package com.web_app.springbootapp.web.controllers;

import com.web_app.springbootapp.model.entities.Advert;
import com.web_app.springbootapp.model.repositories.AdvertRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.List;

@Controller
@RequestMapping("/")
public class HomePageController {

    private AdvertRepository advertRepository;

    public HomePageController(AdvertRepository advertRepository) {
        this.advertRepository = advertRepository;
    }
        @GetMapping
                public String prepareHomePage(Model model){
            List<Advert> allAdverts = advertRepository.findAllByOrderPostedDesc();
            model.addAttribute("adverts", allAdverts);
            return "home-page";
        }

}
