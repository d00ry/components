package out.sda;

import org.springframework.stereotype.Component;

@Component
public class Outside {

    public Outside(){
        System.out.println("Outside the context");
    }
}
