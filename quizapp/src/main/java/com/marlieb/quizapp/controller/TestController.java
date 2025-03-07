package com.marlieb.quizapp.controller;

import com.marlieb.quizapp.model.Test;
import com.marlieb.quizapp.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // Responsible to accept request from the user
@RequestMapping("test")
public class TestController {
    @Autowired // replaces the "new QuestionsService" usually required
    TestService testService;

    @GetMapping("allTest")
    public ResponseEntity<List<Test>> getAllTest() {
        // This is because the service does the work
        return testService.getAllTest();
        // specify status code - link to understand: https://youtu.be/vlz9ina4Usk?t=3063
    }

    @GetMapping("language/{category}")
    public ResponseEntity<List<Test>> getCategory(@PathVariable String category) {
        // Need to pass the specified category Language to Service class
        return testService.getCategory(category);
    }

    @PostMapping("add")
    public ResponseEntity<String> addQuestion(@RequestBody Test question) {
        return testService.addQuestion(question);
        // 201 - 'created'
    }

    @PostMapping("addMultiQuestions")
    public ResponseEntity<List<Test>> addMultipleTestQ(@RequestBody List<Test> multiQuestion) {
        List<Test> savedQuestions = testService.addMultipleTestQ(multiQuestion);
        // Have no idea why error is occurring
        return new ResponseEntity<>(savedQuestions, HttpStatus.CREATED);
        // 201 - 'created'
    }

    // @DeleteMapping -> testDao.delete()
    //  @PutMapping // Update mapping -> testDao.save

//    @GetMapping("randomQuestions")
//    public ResponseEntity<List<Test>> getRandomQuestions(@RequestParam String category, @RequestParam int numQ) {
//        List<Test> questions = testService.getRandomQuestionsByCategory(category, numQ);
//        return new ResponseEntity<>(questions, HttpStatus.OK);
//
//    }
}
/*
### {language} is linked to @PathVariable : so what ever value is received for {language} will be assigned to the language variable
This is done to avoid writing multiple methods for each language type in this example
if {language} and variable language didn't match let's say {lang} : then we would have to write @PathVariable("lang") to be explicit to which path we are referring to.

 ### add-End_Point
 I want it to return as a string but it will be initially inputted as 'Test' object i.e Json format in Postman or other third party applications.
 As we are receiving data with the Get end points in the Json format, so can input in that way.
 Spring Boot then, handles the conversion of Json to a 'Test' object. So all we have to do is specify and that's done through the data-type of the local field 'question'
@RequestBody: The Json data will be submitted in the body, as request has multiple sections.

### postMapping
Postman: This is an application where you can interract with the APIs

### Status Codes

 */