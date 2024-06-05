package org.example.config;

import org.example.components.GenericComponent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public GenericComponent create(){
        return  new GenericComponent();
    }
}
