package com.marlieb.quizapp.DAO;

import com.marlieb.quizapp.model.QuizSession;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizSessionDao extends JpaRepository<QuizSession, Integer> {


}
