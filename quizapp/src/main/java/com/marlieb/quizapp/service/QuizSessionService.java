package com.marlieb.quizapp.service;

import com.marlieb.quizapp.DAO.QuizSessionDao;
import com.marlieb.quizapp.DAO.TestDAO;
import com.marlieb.quizapp.model.QuizSession;
import com.marlieb.quizapp.model.Test;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizSessionService {
    @Autowired
    QuizSessionDao quizSessionDao;
    @Autowired
    TestDAO testDAO;

    @Transactional
    public ResponseEntity<String> createJavaLmtQust(String category, int numQ, String title) {

        try {
            // NEED TO REFER TO TEST Interface to set defined criteria using Native SQL
            List<Test> testQuestions = testDAO.findByCategoryOrderByRandomLimitNumQ(category, numQ);

            System.out.println("Number of questions fetched: " + testQuestions.size());

            if(testQuestions.isEmpty()){
                return new ResponseEntity<>("No questions found for the given criteria", HttpStatus.BAD_REQUEST);
            }

            QuizSession quizSession = new QuizSession();
            quizSession.setQuizTitle(title);
            quizSession.setQuestions(testQuestions);
            // this will save every version of a quiz created in mySQL
            quizSessionDao.save(quizSession);
            return new ResponseEntity<>("Success", HttpStatus.CREATED);
        } catch (Exception e){
            // Need to choose a more specific Exception, refer back to class notes #Todo
            e.printStackTrace();
        }
        return new ResponseEntity<>( "Failed", HttpStatus.BAD_REQUEST);

    }
}
/*
### Steps of the createJavaLmtQust()
    1. Passing the two variables to the original DAO class (testDAO) to specify column and number of rows
    2. Create object of 'quizSession' which has no data in it
    3. The Data annotation from Lombok is creating a set method linked to the 'title' and 'question' variables in QuizSession entity class
    4. Object of 'quizSessionDao' created and a save method used to store all above operations of 'quizSession' variable, so a new table should be created.
    5. As this method returns HTTP response type and string, need specify a message (optional) and correct HTTP status
    6. Put all in try catch block, so the correct message is returned when ran on port.
 */
