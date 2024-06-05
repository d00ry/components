package org.example;
import org.example.components.GenericComponent;
import org.example.components.ServiceComponent;
import org.example.lazy.LazyCompnent;
import org.example.lazy.LazyComponent;
import org.example.scope.PrototypeCLass;
import org.example.scope.SingletonClass;
import org.example.value.Host;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.stereotype.Component;

@SpringBootApplication


public class SpringBootDayOne {

    public static void main(String[] args) {
       var context =  SpringApplication.run(SpringBootDayOne.class);

//        GenericComponent gc = context.getBean(GenericComponent.class);
//        to - get bean
//        System.out.println(gc.getValue());
//
        // used for dependency injection
//        ServiceComponent sc = context.getBean(ServiceComponent.class);
//        System.out.println(sc);

        GenericComponent gc = context.getBean(GenericComponent.class);
//used to inject the field with value
        Host h = context.getBean(Host.class);
        System.out.println("URL: " + h.getUrl());
        System.out.println("USER: " + h.getUser());
        System.out.println("PASSWORD: " + h.getPassword());


        SingletonClass s1 = context.getBean(SingletonClass.class);
        SingletonClass s2 = context.getBean(SingletonClass.class);
        SingletonClass s3 = context.getBean(SingletonClass.class);

        PrototypeCLass p1 = context.getBean(PrototypeCLass.class);
        PrototypeCLass p2 = context.getBean(PrototypeCLass.class);
        PrototypeCLass p3 = context.getBean(PrototypeCLass.class);

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p3.hashCode());

        //fetch lazily
        LazyComponent lz = context.getBean(LazyComponent.class);


    }
}
