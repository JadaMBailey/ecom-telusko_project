package com.marlieb.quizapp.service;

import com.marlieb.quizapp.DAO.TestDAO;
import com.marlieb.quizapp.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service // This Service Layer is just fetch data from DAO layer
public class TestService {
    @Autowired
    TestDAO testDAO;

    public ResponseEntity<List<Test>> getAllTest() {
       try {
           return  new ResponseEntity<>(testDAO.findAll(), HttpStatus.OK);
           // this findAll() is from the JpaRepository that QuestionsDAO is extending
       } catch (Exception e) {
        e.printStackTrace();
       }
        return  new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST); // sending status code too
       // Have to return something, so an empty arrayList chosen, not sure why #Todo
        // Questioning why he has put Bad request and not 'NOT found' status code #Todo

    }
//
    public ResponseEntity<List<Test>> getCategory(String category) {
        // need to pass category in so DAO knows what category type to find
    try{
        return new ResponseEntity<>(testDAO.findByCategory(category), HttpStatus.OK);
    } catch (Exception e){
      e.printStackTrace(); // I assume this prints to the console for developer to review and not to the client side
    }
        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<String> addQuestion(Test question) {
        testDAO.save(question);
      try {
          return new ResponseEntity<>("success", HttpStatus.CREATED);
      } catch (Exception e){
          e.printStackTrace();
      }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        // confirmation question added through API. However wondering whether it didn't need to return anything #Todo
    }
}
