package es.nom.marcosfernandez.services;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloService {


    @RequestMapping("/")
    public String home() {
        return "Root Mapping";
    }

}
