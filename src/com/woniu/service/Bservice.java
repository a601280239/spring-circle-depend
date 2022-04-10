package com.woniu.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class Bservice {


    @Autowired
    private Aservice aservice;


    public void print(){
        System.out.println("in Bservice,Aservice="+aservice);
    }
}
