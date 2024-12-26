package com.newproject.FirstApp;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//We use @Component annotation to tell the spring container that this is the class that is managed by spring container
@Component
//@Primary we cannot use this annotation here because we have already used this annotation in Asia class
public class Country implements India {

    public void country(){
        System.out.println("This is the India");
    }
 }
