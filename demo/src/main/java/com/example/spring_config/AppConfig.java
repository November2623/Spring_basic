package com.example.spring_config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import com.example.spring_language_implement.Vietnamese;
import com.example.spring_language.Language;
@Configuration
@ComponentScan({"com.example.spring_bean"})
public class AppConfig {
    @Bean(name = "language")
    public Language getLanguage() {

        return new Vietnamese();

    }
}

