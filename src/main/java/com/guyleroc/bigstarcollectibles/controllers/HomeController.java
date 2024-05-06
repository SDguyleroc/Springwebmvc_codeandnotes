package com.guyleroc.bigstarcollectibles.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class HomeController {


    @GetMapping("/home")
    public String DisplayHome(Model model) {

        return "index";
        // ViewResolver ---> ThymeleafViewResolver

        /**
         * Another thing is to note here is that you could also grab the Model API from the
         * org.springframework.ui.Mode package  in case you want to store any data that you
         * want to display on the index.html page
         *
         */
    }

    @GetMapping("/getCharacter/{charname}")
    public String getCharacter(@PathVariable("charname") String charname){
        return "/characters/"+charname;
    }
}
