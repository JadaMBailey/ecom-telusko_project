package com.marlieb.quizapp.controller;

import com.marlieb.quizapp.Test;
import com.marlieb.quizapp.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController // Responsible to accept request from the user
@RequestMapping("test")
public class TestController {
    @Autowired // replaces the "new QuestionsService" usually required
    TestService testService;

    @GetMapping("allTest")
    public List<Test> getAllTest(){
        // This is because the service does the work
        return testService.getAllTest();

    }

    @GetMapping ("language/{category}")
    public List<Test> getCategory(@PathVariable String category)
    {
        // Need to pass the specified category Language to Service class
        return testService.getCategory(category);
    }
}
/*
### {language} is linked to @PathVariable : so what ever value is received for {language} will be assigned to the language variable
This is done to avoid writing multiple methods for each language type in this example
if {language} and variable language didn't match let's say {lang} : then we would have to write @PathVariable("lang") to be explicit to which path we are referring to.
 */