package com.example.LadyJanesApp.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "home")
public class home {

    @ResponseBody
    @RequestMapping(value = "", method = RequestMethod.GET)
    // have the heading are you a stylist or client?
    // show a screen with the ability to choose between stylist or client
    public String index(){
        return "Hello World!";
    }


}
