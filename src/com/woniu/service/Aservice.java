package com.woniu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class Aservice {

    @Autowired
    private Bservice bservice;

    public void print(){
        System.out.println("in Aservice,Bservice="+bservice);
    }


}
