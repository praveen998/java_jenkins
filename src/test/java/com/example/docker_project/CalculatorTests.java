package com.example.docker_project;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

//functional unit test

public class CalculatorTests {
    
    @Test
    public void testAddvalues() {

        Calculator calc =new Calculator();
        assertEquals(4,calc.addvalues(2,2));
    }
 
}
