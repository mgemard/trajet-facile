package com.poe.trajetfacile.controller.security;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
    // Login form
    @RequestMapping("/login")
    public String login() {
        return "login";
    }

}