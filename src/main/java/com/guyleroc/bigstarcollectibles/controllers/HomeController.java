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
    /**
 * Constructs the URL path to view the details of a character, given the character's name.
 * This method is used to generate the URL path for the "View Character Details" link,
 * which allows users to navigate to the details page of a specific character.
 * 
 * @param charname The name of the character for which details are to be viewed.
 * @return */
    @GetMapping("/getCharacter/{charname}")
    public String getCharacter(@PathVariable("charname") String charname){
        return "/characters/"+charname;
    }
}
