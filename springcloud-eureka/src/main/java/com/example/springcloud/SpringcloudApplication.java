package com.example.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName SpringcloudApplication
 * @Description TODO
 * @Author liuyy
 * @Date 2019年5月17日15:45:58
 **/
@SpringBootApplication
@EnableEurekaServer
public class SpringcloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudApplication.class, args);
    }

}
