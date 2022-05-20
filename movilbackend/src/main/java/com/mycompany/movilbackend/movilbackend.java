package com.mycompany.movilbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;

@SpringBootApplication
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
public class movilbackend {
    public static void main(String[] args) {
        SpringApplication.run(movilbackend.class, args);
    }
    
}
