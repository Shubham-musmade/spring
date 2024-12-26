package com.newproject.FirstApp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


//We use @Component annotation to tell the spring container that this is the class that is managed by spring container
@Component
public class Human {

    //We use @Autowired annotation to tell the spring container that this is the dependency of the class
    @Autowired //Field Injection
    @Qualifier("asia") //This annotation is used to tell the spring container that which bean we want to use
    private India country;

    //For Constructor Injection
    // public Human(Country country){
    //     this.country = country;
    // }

    public void Person(){

        country.country();
        System.out.println("This is the person");
    }
}
