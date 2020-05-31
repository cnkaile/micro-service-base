package com.qcode.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloReqService {

	@Autowired
	private RestTemplate restTemplate;

	@HystrixCommand(fallbackMethod = "reqError")
	public String helloReq(String name){
		return restTemplate.getForObject("http://hello-service/hello?name=" + name, String.class);
	}

	public String reqError(String name){
		return "error info " + name;
	}

}
