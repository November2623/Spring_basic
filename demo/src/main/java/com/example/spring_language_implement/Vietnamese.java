package com.example.spring_language_implement;
import com.example.spring_language.Language;

// Tiếng Việt
public class Vietnamese implements Language {

    @Override
    public String getGreeting() {
        return "Xin Chao";
    }

    @Override
    public String getBye() {
        return "Tam Biet";
    }

}