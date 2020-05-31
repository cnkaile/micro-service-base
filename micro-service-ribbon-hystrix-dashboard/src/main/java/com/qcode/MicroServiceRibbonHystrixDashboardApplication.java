package com.qcode;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient	//注册中心客户端
@EnableHystrix			//Hystrix
@EnableHystrixDashboard	//Hystrix仪表盘
public class MicroServiceRibbonHystrixDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServiceRibbonHystrixDashboardApplication.class, args);
	}

	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}

	@Bean
	public ServletRegistrationBean hystrixMetricsStreamServlet(){
		ServletRegistrationBean registrationBean = new ServletRegistrationBean<>(new HystrixMetricsStreamServlet());
		registrationBean.addUrlMappings("/hystrix.stream");
		return registrationBean;
	}

}
