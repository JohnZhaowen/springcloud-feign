package com.john.springcloud;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.john.springcloud.entity.User;

@FeignClient("EUREKA-PROVIDER")
public interface ApiService {
	
	@RequestMapping("/getMsg")
	String getMsg();
	
	@RequestMapping("/getName")
	String getName(@RequestBody User user);
	
	@RequestMapping("/getUserById")
	User getUser(@RequestParam Long id);
	
	@RequestMapping("/getUserByName")
	User getUser(@RequestParam String name, @RequestParam Integer age);
}
