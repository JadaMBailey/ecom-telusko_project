package com.marlieb.simpleWebApp;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

// REST : stands Representation state transfer (return data from server to client
@RestController
//@Controller
public class HomeController {

    @RequestMapping("/")
    public String greet(){
        return "Welcome to Jada's Page";
    }

}
