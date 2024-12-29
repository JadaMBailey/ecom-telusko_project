package org.example;
import org.junit.Test;

import static org.junit.Assert.*;
public  class ReverseStringTest {

    @Test
    public void testnames(){
        ReverseString name = new ReverseString();
        String actual = name.reverseString("Jada");
        String expected = "adaJ";
        assertEquals(expected,actual);
        actual = name.reverseString("Bailey");
        expected = "yeliaB";
        assertEquals(expected, actual);
    }

}