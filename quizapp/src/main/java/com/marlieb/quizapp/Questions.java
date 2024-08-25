package com.marlieb.quizapp;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;
@Data // this is a Lombok anno that handles 'getters' and 'setters' plus to-string, without writing it out
@Entity //
@Table (name = "questions")

public class Questions {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID) // This annotation will generate id, I don't need to set it
    @Column(name = "User_name")
    private UUID userName;
    @Column(name = "category")
    private String category;
    @Column(name = "Quantity_of_Projects_made")// one core language
    private Integer amountOfProjectsMade;
    @Column(name = "What_is_the_next_lang_you_want_to_learn")
    private String whatLangLearnNext;

}
