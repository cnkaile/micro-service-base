package com.qcode.controller;

import com.qcode.service.HelloFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@Autowired
	private HelloFeignService helloFeignService;

	@RequestMapping(value = "/hi")
	public String hi(@RequestParam("name") String name){
		return helloFeignService.feignReqHelloService(name);
	}
}
