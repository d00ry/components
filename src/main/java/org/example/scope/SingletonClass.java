package org.example.scope;

import org.springframework.stereotype.Component;

@Component
public class SingletonClass {

    public SingletonClass() {
        System.out.println("Singletone");
    }
}
