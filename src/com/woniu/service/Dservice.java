package com.woniu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class Dservice {

    private Cservice cservice;
    public Dservice(@Autowired Cservice c){
        this.cservice=c;
    }
}
