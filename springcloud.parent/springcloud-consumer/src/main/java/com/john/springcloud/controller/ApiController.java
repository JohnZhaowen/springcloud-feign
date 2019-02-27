package com.john.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.john.springcloud.ApiService;
import com.john.springcloud.entity.User;

@RestController
public class ApiController {
	
	@Autowired
	private ApiService apiService;
	
	@RequestMapping("/consumerGetMsg")
	public String getMsg() {
		return apiService.getMsg();
	}
	
	@RequestMapping("/consumerGetName")
	public String getName(User user) {
		System.out.println(user.getName());
		return apiService.getName(user);
	};
	
	@RequestMapping("/consumerGetUserById")
	public User getUser(Long id) {
		
		return apiService.getUser(id);
	}
	
	@RequestMapping("/consumerGetUserByName")
	public User getUser(String name, Integer age) {
		return apiService.getUser(name, age);
	}

}
