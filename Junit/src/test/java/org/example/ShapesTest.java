package org.example;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.*;

public class ShapesTest {
    Shapes shape = new Shapes();
    @Test // by default, it passes, so it could have nothing in it and still pass
    public void testComputeSqaureArea(){

        assertEquals(16,shape.computeSquareArea(4));

    }

    @Test
    @DisplayName("Should fail")
    public void testComputerCircleArea(){
       assertEquals(27,shape.computeCircleArea(3));
    }
}
