package com.john.springcloud.service.impl;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.john.springcloud.ApiService;
import com.john.springcloud.entity.User;

@RestController
public class ApiServiceImpl implements ApiService   {
	//如果实现了对应的Feign servce接口,则@RequestMapping可以不再写
	//也可以不实现该接口,但是必须保证方法签名与接口的方法签名相同,而且@RequestMapping也必须保持与接口相同

	public String getMsg() {
		return "I am msg";
	}
	
	public String getName(@RequestBody User user) {//必须加@RequestBody,否则会导致user的属性传不过来
		System.out.println(user.getName());
		return user.getName();
	}

	public User getUser(Long id) {
		if(id == 1) {
			
			return new User(1L, "name1", "addr1", 1);
		}
		return new User(2L, "name2", "addr2", 2);
	}

	public User getUser(String name, Integer age) {
		
		return new User(3L, name, "addr3", age);
	}

}
