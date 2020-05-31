package com.qcode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class RegistryCenterEurekaServer2Application {


    public static void main(String[] args) {
        SpringApplication.run(RegistryCenterEurekaServer2Application.class, args);

    }
}
