package com.rest.restapplication.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet(){
        System.out.println("I'm Here");
        return "Welcome to Homepage!!!";
    }

    @RequestMapping("/about")
    public String about(){
        return "Welcome to about page!!";
    }
    
}
