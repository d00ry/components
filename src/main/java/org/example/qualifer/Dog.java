package org.example.qualifer;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary//used incas we dont have @Qualifier
public class Dog implements  Animal{

    @Override
    public String sound(){
        return "humhum";
    }

}
