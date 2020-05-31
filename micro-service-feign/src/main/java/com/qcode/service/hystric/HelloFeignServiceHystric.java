package com.qcode.service.hystric;

import com.qcode.service.HelloFeignService;
import org.springframework.stereotype.Component;

@Component
public class HelloFeignServiceHystric implements HelloFeignService {

    @Override
    public String feignReqHelloService(String name) {
        System.out.println("name error");
        return name + "  error  !";
    }
}
