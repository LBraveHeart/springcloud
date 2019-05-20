package com.example.eurekemore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekeMoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekeMoreApplication.class, args);
    }

}
