package com.khana.khazana.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping(value = "Home")
    public String home(){
        return "Hello friends khana khalo";
    }

}
