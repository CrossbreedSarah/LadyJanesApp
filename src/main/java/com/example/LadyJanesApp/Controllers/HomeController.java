package com.example.LadyJanesApp.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "home")
public class HomeController {

    @RequestMapping(value = "")
    public String index(Model model){
        return "home/index";
    }

    @RequestMapping
    public String clientLogin (Model model){

    return "client/login";
    }
}
