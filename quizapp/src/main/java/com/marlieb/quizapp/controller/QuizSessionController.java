package com.marlieb.quizapp.controller;

import com.marlieb.quizapp.model.Test;
import com.marlieb.quizapp.service.QuizSessionService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("quiz-session")
public class QuizSessionController {

   @Autowired
    QuizSessionService quizSessionService;

    @PostMapping("create")
    public ResponseEntity<String> createJavaLmt5(@RequestParam String category, @RequestParam int numQ, @RequestParam String title){
        // if you want to accept the URL variables needs to use @RequesgtParam
        // Because we are sending a criteria, it needs to be passed in as a local variable
        quizSessionService.createJavaLmtQust(category,numQ,title);
        return new ResponseEntity<>("I am here", HttpStatus.CREATED);
        // made change to HTTP status, as I was receiving '200' and I WANTED '201' in Postman
    }

}
