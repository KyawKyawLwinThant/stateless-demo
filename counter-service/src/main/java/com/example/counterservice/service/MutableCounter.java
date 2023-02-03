package com.example.counterservice.service;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

@Service
@SessionScope
public class MutableCounter {

    private int number;

    public int getNumber() {
        return number;
    }
    public void countUp(){
        ++number;
    }
}
