package com.qcode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MicroServiceConfigEurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServiceConfigEurekaClientApplication.class, args);
	}

}
