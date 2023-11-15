package com.example.docker_project;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

//boundary unit test
public class ValidatorTests {
    @Test
    public void testIsValid() {

        Validator valid =new Validator();
        assertTrue(valid.isValid(29));
         assertFalse(valid.isValid(30));
          assertTrue(valid.isValid(1));
           assertFalse(valid.isValid(49));
    }
}
