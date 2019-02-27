package com.john.springcloud.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.john.springcloud.api.FeignApiService;
import com.john.springcloud.entity.User;


@RestController
public class FeignApiController implements FeignApiService {

	@Override
	@RequestMapping(value="/getName")
	public String getName() {
		return "yy";
	}

	@Override
	@RequestMapping(value="/getUser")
	public User getUser(@RequestParam Long id) {
		if(1 == id) {
			return new User(1L, "aa");
		} else {
			return new User(2L, "bb");
		}
	}

	@Override
	@RequestMapping(value="/getId")
	public String getId(@RequestBody User user) {
		return user.getId().toString();
	}
}
