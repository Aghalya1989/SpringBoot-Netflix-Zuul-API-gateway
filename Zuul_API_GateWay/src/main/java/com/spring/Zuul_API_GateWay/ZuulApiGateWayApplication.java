package com.spring.Zuul_API_GateWay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ZuulApiGateWayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulApiGateWayApplication.class, args);
	}

}
