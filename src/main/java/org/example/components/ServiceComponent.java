package org.example.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceComponent {

  //  @Autowired - inject by field
    private RepositoryComponent repository;

    // constructor injection
//    public ServiceComponent(RepositoryComponent repository){
//        this.repository = repository;
//        System.out.println("Service comp...");
//    }

    public RepositoryComponent getRepository() {
        return repository;
    }

    @Autowired
    public void setRepository(RepositoryComponent repository) {
        this.repository = repository;
    }
}
