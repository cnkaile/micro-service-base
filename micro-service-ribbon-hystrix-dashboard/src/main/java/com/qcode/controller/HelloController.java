package com.qcode.controller;

import com.qcode.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HelloController {
	@Autowired
	private HelloService helloService;

	@RequestMapping("/hi")
	public String hi(String name ){
		return helloService.hi(name);
	}
}
