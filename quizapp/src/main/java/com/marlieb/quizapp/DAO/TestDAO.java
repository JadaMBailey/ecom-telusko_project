package com.marlieb.quizapp.DAO;

import com.marlieb.quizapp.model.Test;
import com.marlieb.quizapp.model.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface TestDAO extends JpaRepository <Test, Integer>{
    // Need to fetch the data from database
    public List<Test> findByCategory(String category);

    // @Query : Have to specify two things, query & boolean it is 'nativeQuery'
    // To specify a variable you need to put a : symbol
    // Need to research what 'q' refers to in SQL query #Todo
    @Query(value = "SELECT test.id, test.question_title, test.category, test.option_1, test.option_2, test.option_3, test.option_4" +
            "FROM test q WHERE q.category=:category ORDER BY RANDOM() LIMIT :numQ", nativeQuery = true)
    List<Test> findByCategoryOrderByRandomLimitNumQ(String category, int numQ);
// to understand @Query #Todo : https://www.geeksforgeeks.org/spring-boot-jpa-native-query-with-example/
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