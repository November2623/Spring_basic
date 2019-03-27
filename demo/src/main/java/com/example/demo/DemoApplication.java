package com.example.demo;
import com.example.spring_bean.GreetingService;
import com.example.spring_bean.MyComponent;
import com.example.spring_config.AppConfig;
import com.example.spring_language.Language;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args){
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Language language = (Language) context.getBean("language");

        System.out.println("Bean Language" + language);
//        GreetingService service = (GreetingService) context.getBean("greetingService");
//        service.sayGreeting();

        MyComponent myComponent = (MyComponent) context.getBean("myComponent");

        myComponent.showAppInfo();


    }

}
