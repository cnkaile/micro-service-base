package com.qcode.service;

import com.qcode.service.hystric.HelloFeignServiceHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Service
@FeignClient(value = "hello-service", fallback = HelloFeignServiceHystric.class)
public interface HelloFeignService {

	@RequestMapping("/hello")
	public String feignReqHelloService(@RequestParam("name") String name);
}
