package com.marlieb.quizapp.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table (name = "quiz_session")
public class QuizSession
{
        @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
        private Integer questionRef;
    private String quizTitle;

    @ManyToMany
    private List<Test> questions;
    //@JoinTable(
    //        name = "quiz_session_questions",
    //        joinColumns = @JoinColumn(name = "quiz_session_id"),
    //        inverseJoinColumns = @JoinColumn(name = "test_id")
    //)

}

