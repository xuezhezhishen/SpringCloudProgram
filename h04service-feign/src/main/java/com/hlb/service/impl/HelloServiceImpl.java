package com.hlb.service.impl;

import org.springframework.stereotype.Service;

import com.hlb.service.HelloService;

@Service
public class HelloServiceImpl implements HelloService{

	@Override
	public String sayHiFromClientOne(String name) {
		// TODO Auto-generated method stub
		return "sorry, server is unreachable";
	}

}
