package com.woniu.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class Cservice {

    private Dservice dservice;

    public Cservice(@Autowired Dservice d){
        this.dservice=d;
    }
}
