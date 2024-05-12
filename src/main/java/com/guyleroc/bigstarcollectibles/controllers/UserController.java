package com.guyleroc.bigstarcollectibles.controllers;

import com.guyleroc.bigstarcollectibles.bean.User;
import com.guyleroc.bigstarcollectibles.dao.UserRepository;
import com.guyleroc.bigstarcollectibles.validators.UserValidator;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

//    private UserValidator userValidator;

    private UserRepository userRepository;


    public UserController( UserRepository userRepository) {
//        this.userValidator = userValidator;
        this.userRepository = userRepository;
    }

//    @InitBinder
//    public void bindUser(WebDataBinder binder) {
//        binder.addValidators(this.userValidator);
//    }

    @GetMapping("/newUser")
    public String DisplayRegistractionForm(Model model){

        model.addAttribute("user", new User());

        return "register-user";
    }


@PostMapping("/saveUser")
    public String SaveUser(@ModelAttribute("user") @Valid User user, BindingResult result, Model model){

        // validate & save user to db

        if(result.hasErrors()) {
            return "register-user";
        }
        User savedUser = userRepository.save(user);
        if(savedUser != null) {
            model.addAttribute("userSaved", true);
        }
        return "register-user";
}

}
