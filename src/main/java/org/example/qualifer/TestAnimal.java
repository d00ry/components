package org.example.qualifer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TestAnimal {

    public final Animal animal;

    @Autowired
    public TestAnimal( Animal animal) {
        this.animal = animal;
        System.out.println(animal.sound());
    }
}
