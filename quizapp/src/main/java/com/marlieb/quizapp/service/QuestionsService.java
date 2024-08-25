package com.marlieb.quizapp.service;

import com.marlieb.quizapp.DAO.QuestionsDAO;
import com.marlieb.quizapp.Questions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // This Service Layer is just fetch data from DAO layer
public class QuestionsService {
    @Autowired
    QuestionsDAO questionsDAO;

    public List<Questions> getAllQuestions() {
        return  questionsDAO.findAll();
        // this findAll() is from the JpaRepository that QuestionsDAO is extending
    }

    public List<Questions> getCategory(String category) {
        // need to pass category in so DAO knows what category type to find
    return questionsDAO.findByCategory(category);
    }
}
