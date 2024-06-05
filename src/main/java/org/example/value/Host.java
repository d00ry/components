package org.example.value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;

@Component
@PropertySource("app.properties")

public class Host {

//  @Value("sdaal")
    @Value("${sda.url}")//get the value from a properties file
    private String url;

    @Value("${user}")
    private String user;

    @Value("${password}")
    private String password;

//    public Host( @Value("sda.al")String url) {
//        this.url = url;
//        System.out.println("URL: " + url);
//    }
    public String getUrl() {
        return url;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }
}
