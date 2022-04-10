package com.woniu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Eservice {

    @Autowired
    private Fservice fservice;
}
