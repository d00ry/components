package org.example.qualifer;

import org.springframework.stereotype.Component;

@Component
public class Wolf implements Animal{

    @Override
    public String sound() {
        return "uuu";
    }
}
