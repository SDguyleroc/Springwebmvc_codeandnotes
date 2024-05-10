package com.guyleroc.bigstarcollectibles.controllers;

import com.guyleroc.bigstarcollectibles.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/newUser")
    public String DisplayRegistractionForm(Model model){

        model.addAttribute("user", new User());

        return "register-user";
    }
}
