package com.example.spring_language_implement;
import com.example.spring_language.Language;
// Tiếng anh
public class English  implements Language {

    @Override
    public String getGreeting() {
        return "Hello";
    }

    @Override
    public String getBye() {
        return "Bye bye";
    }


}