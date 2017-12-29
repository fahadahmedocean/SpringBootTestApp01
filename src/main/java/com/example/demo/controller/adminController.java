package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class adminController {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(Model model) {
        System.out.println("-----------index-------------");

        model.addAttribute("myMessage", "Hey we have run it successfully.....");


        return "index";
    }


}
