package com.example.jwtExample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class HomeController {

    @RequestMapping("/test")
    public String Home() {
        return "Hello Everyone";
    }

    @GetMapping("/current-user")
    public String getLoggedInUser(Principal principal) {
        return principal.getName();
    }


}
