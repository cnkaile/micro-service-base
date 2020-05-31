package com.qcode.controller;

import com.qcode.service.HelloReqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@Autowired
	private HelloReqService helloReqService;

	@RequestMapping("/hi")
	public String hi(String name){
		return helloReqService.helloReq(name);
	}
}
