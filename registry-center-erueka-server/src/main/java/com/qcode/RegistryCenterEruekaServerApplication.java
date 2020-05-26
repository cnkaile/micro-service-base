package com.qcode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class RegistryCenterEruekaServerApplication {


    public static void main(String[] args) {
        SpringApplication.run(RegistryCenterEruekaServerApplication.class, args);

    }
}
