package com.lic.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LicController {
	@Autowired
	private LicServiceImpl licService;
	@Autowired
	private LicServiceImpl2 licService2;
	@Autowired
	private LicServiceImpl3 licService3;

	@RequestMapping("test1")
	public String testController(){
		licService.testService();
		return "SUCCESS";
	}

	@RequestMapping("test2")
	public String testController2(){
		licService2.testService();
		return "SUCCESS";
	}
	@RequestMapping("test3")
	public String testController3(){
		licService3.testService();
		return "SUCCESS";
	}
}
