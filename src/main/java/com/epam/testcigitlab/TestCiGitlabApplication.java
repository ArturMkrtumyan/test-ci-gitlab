package com.epam.testcigitlab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping
public class TestCiGitlabApplication {

    @GetMapping
    public String test(){
        return "Hello gitlab CI";
    }

    public static void main(String[] args) {
        SpringApplication.run(TestCiGitlabApplication.class, args);
    }

}
