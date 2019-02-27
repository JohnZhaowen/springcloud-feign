package com.john.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.john.springcloud.api.FeignApiService;
import com.john.springcloud.entity.User;

@RestController
public class FeignApiController {
	
	@Autowired
	private FeignApiService service;

	@RequestMapping(value="/getConsumerName")
	public String getName(Long id) {
		
		String userId = service.getId(new User(10L, "mm"));
		User user = service.getUser(id);
		
		System.out.println("userId: " + userId);
		System.out.println("user: " + user.getId() + " : " + user.getName());
		
		return service.getName();
	}

}
