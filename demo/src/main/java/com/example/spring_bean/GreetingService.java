package com.example.spring_bean;

import com.example.spring_language.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    @Autowired
    private Language language;
    public GreetingService(){

    }
    public void sayGreeting(){
        String greeting = language.getGreeting();
        System.out.println("Greeting" + greeting);
    }
}
