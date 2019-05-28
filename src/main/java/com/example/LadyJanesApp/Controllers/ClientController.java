package com.example.LadyJanesApp.Controllers;

import com.example.LadyJanesApp.Models.Client;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "client")
public class ClientController {

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String addClient(Model model){

        model.addAttribute("client", new Client());
        model.addAttribute("title", "Register");

        return "client/add";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String addClient(Model model, @ModelAttribute Client client, String verify){
        if (client.getPassword().equals(verify)){
            model.addAttribute(client);
            if (client.getPassword().equals(verify)){
                return "client/index";
            }
            model.addAttribute("error", "Error: Passwords do not match.");
            model.addAttribute("title", "Register");
        }
        return "client/index";
    }
}