package com.springbootPro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class loginController {
    @ResponseBody
    @RequestMapping("/login")
    public String login(){
        return "login";
    }
}
