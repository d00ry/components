package org.example.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class App implements CommandLineRunner {
    @Override
    public void run(String[] args) throws Exception{

        System.out.println("Inside Command Line runner");
    }
}
