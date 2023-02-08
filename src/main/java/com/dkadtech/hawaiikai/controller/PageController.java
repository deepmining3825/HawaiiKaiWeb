package com.dkadtech.hawaiikai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class PageController {
    @GetMapping("/")
    public String indexPage() {
        System.out.println("Call index");
        return "register.html";
    }

    @GetMapping("/login")
    public String loginPage() {
        System.out.println("Call login");
        return "login.html";
    }

    @GetMapping("/register")
    public String registerPage() {
        System.out.println("CAll register");
        return "register.html";
    }

}
