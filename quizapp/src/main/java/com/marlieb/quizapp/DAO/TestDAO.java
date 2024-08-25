package com.marlieb.quizapp.DAO;

import com.marlieb.quizapp.Questions;
import com.marlieb.quizapp.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface TestDAO extends JpaRepository <Test, UUID>{
    // Need to fetch the data from database
//    public List<Questions> findByCategory(String category);

}

/*
JPARepositiory dependency (can view in Pom.xml) handles the lengthy practice of JDBC connections
that is the reason for extending.
JpaRepository does require two details
1) What type of table are you working with - (CLASS NAME)
2) what is the type of the Primary Key for that table

### Benefits of JpaRepository
- we do not need to define the actions needed for the 'getMainLanguage' method, as main language is part a table, so
JpaRepository is smart enough to find data based on a category.
 */