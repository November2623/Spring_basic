package com.example.spring_bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyComponent {
    @Autowired MyRepository myRepository;
    public void showAppInfo(){
        System.out.println("Now is" + myRepository.getSystemDate());
    }
}
