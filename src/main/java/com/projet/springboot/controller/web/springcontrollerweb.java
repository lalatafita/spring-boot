package com.projet.springboot.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class springcontrollerweb {

    @RequestMapping("/home-page")
    public String home() {
        System.out.println("merci ty");
        System.out.println("aona aa");
        return "index";
    }
}
