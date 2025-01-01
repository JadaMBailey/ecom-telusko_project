package com.marlieb.simpleWebApp;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet(){
        return "Welcome to Jada's Page";
    }

    @RequestMapping("/about")
    public String about(){
        return "My Journey into the Tech Space";
    }

}
