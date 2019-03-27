package com.example.spring_bean;

import org.springframework.stereotype.Repository;
import java.util.Date;
@Repository
public class MyRepository {
    public String getAppName(){
        return "hello Spring app";

    }
    public Date getSystemDate(){
        return new Date();
    }
}
