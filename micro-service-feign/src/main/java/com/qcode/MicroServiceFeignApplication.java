package com.qcode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/*
sjflksdjf
 */
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class MicroServiceFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServiceFeignApplication.class, args);
	}

}
