package viva.example.vivaops;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class controller {
    @GetMapping("/")
    public String ajay(){
        return "Hello vivaops this is a java project";
    }
}
