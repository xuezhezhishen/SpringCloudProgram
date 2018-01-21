package com.hlb.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.hlb.service.impl.HelloServiceImpl;

@FeignClient(value = "service-hi", fallback=HelloServiceImpl.class)
public interface HelloService {
	
	@RequestMapping(value = "/hi",method = RequestMethod.GET)
	String sayHiFromClientOne(@RequestParam(value = "name") String name);

}
