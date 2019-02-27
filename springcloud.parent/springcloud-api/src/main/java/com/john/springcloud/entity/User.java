package com.john.springcloud.entity;

import java.io.Serializable;

public class User implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private Long id;
	
	private String name;
	
	private String addr;
	
	private Integer age;
	
	public User() {
		super();
	}

	public User(Long id, String name, String addr, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.addr = addr;
		this.age = age;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
}
