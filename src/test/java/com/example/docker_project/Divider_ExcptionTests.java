package com.example.docker_project;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;

public class Divider_ExcptionTests {
    @Test
    public void testDivide() {

        Divider_Excption div=new Divider_Excption();
        assertEquals(2,div.divide(6, 3));
        assertThrows(IllegalArgumentException.class,() -> div.divide(5, 0),"no exception");


    }
}
