package com.bj.betapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BetApiApplication {

    @GetMapping("/")
    public String testMsg() {
        return "Deployment works!";
    }

    public static void main(String[] args) {
        SpringApplication.run(BetApiApplication.class, args);
    }

}
