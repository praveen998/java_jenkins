package com.example.docker_project;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.contains;

import org.junit.Test;

public class Counter_staeunittestTests {
    @Test
    public void testGetcount() {

        Counter_staeunittest counter=new Counter_staeunittest();
        counter.increment();
        counter.increment();
        assertEquals(2, counter.getcount());

    }
}
