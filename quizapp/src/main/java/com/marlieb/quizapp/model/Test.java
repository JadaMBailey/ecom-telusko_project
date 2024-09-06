package com.marlieb.quizapp.model;

import jakarta.persistence.*;
import lombok.Data;

@Data // this is a Lombok anno that handles 'getters' and 'setters' plus to-string, without writing it out
@Entity //
@Table (name = "testing_knowledge")
public class Test {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // This annotation will generate id, I don't need to set it
    private Integer id;
    @Column(name = "question_title")
    private String questionTitle;
    @Column(name = "option_1")
    private String option1;
    @Column(name = "option_2")
    private String option2;
    @Column(name = "option_3")
    private String option3;
    @Column(name = "option_4")
    private String option4;
    @Column(name = "right_answer")
    private String rightAnswer;
    @Column(name = "difficult_level")
    private String difficultyLevel;
    private String category;

    public Test(String questionTitle, String option1, String option2, String option3, String option4, String rightAnswer, String difficultyLevel, String category) {
        this.questionTitle = questionTitle;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.rightAnswer = rightAnswer;
        this.difficultyLevel = difficultyLevel;
        this.category = category;
    }
}
/*
### @Data
it seems that if it is not included, it will output empty list, then you would have to create the associated getters and setters
 */