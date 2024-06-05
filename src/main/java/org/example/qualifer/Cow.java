package org.example.qualifer;

import org.springframework.stereotype.Component;

@Component
public class Cow implements Animal{

    @Override
    public String sound(){
        return  "ouu";
    }
}
