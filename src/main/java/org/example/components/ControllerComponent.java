package org.example.components;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Controller
public class ControllerComponent {

    public ControllerComponent(){
        System.out.println("Controller comp...");
    }
}
