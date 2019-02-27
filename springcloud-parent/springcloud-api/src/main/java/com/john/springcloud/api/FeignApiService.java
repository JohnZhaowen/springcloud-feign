package com.john.springcloud.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.john.springcloud.entity.User;

@FeignClient(name="demo-feign-freeservice")
public interface FeignApiService {
	
	@RequestMapping(value="/getName")
	String getName();
	
	@RequestMapping(value="/getUser")
	User getUser(@RequestParam Long id);
	
	@RequestMapping(value="/getId")
	String getId(@RequestBody User user);
}
