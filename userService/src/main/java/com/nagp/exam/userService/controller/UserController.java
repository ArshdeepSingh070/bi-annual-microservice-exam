package com.nagp.exam.userService.controller;

import javax.ws.rs.GET;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private EurekaClient eurekaClient;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping
	public String showUser() {
		return "hi user";
	}
	
	@GetMapping("/order/{id}")
	public String getOrder (@PathVariable String id) {
		String response;
		String url = "/order/showOrder";
		InstanceInfo instance = eurekaClient.getNextServerFromEureka("orderService", false);
		response = restTemplate.getForObject(instance.getHomePageUrl() +  url , String.class);
		return response;
	}
}
