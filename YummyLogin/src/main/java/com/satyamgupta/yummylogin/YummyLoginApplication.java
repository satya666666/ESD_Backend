package com.satyamgupta.yummylogin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class YummyLoginApplication {

    public static void main(String[] args) {
        SpringApplication.run(YummyLoginApplication.class, args);
    }

}
