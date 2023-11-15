package com.example.docker_project;

//exception unit test
public class Divider_Excption {

    public int divide(int a,int b)
    {
        if (b==0)
        {
            throw new IllegalArgumentException("cannot dividedbu zero");
        }
        return a/b;
    }
    
}
