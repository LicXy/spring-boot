package com.lic.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/web")
public class WebController {

	@RequestMapping("/test")
	public String test() {
		return "Hello World!";
	}
}