package com.newproject.FirstApp;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//We use @Component annotation to tell the spring container that this is the class that is managed by spring container
@Component
@Primary //This annotation is used to tell the spring container that this is the primary bean
public class Asia implements India {

    public void country(){
        System.out.println("This is the Asia");
    }
 }
