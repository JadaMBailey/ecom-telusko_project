package com.marlieb.quizapp.DAO;

import com.marlieb.quizapp.model.QuizSession;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
// Not happy with the table names given, as I specified the title and can not see 'JQuiz' in mySQL
@Query(nativeQuery = true, value = "INSERT selectionData FROM test INTO quiz_session_questions")
public interface QuizSessionDao extends JpaRepository<QuizSession, Integer> {


}
