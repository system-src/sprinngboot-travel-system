package com.qianxia.sys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@RequestMapping("")
public class PageController {
	
	@RequestMapping("helloUI")
	public String helloUI() {
		return "hello";
	}
	
	@RequestMapping("/hello")
	@ResponseBody
	public String doSayHello() {
		return "hello springboot";
	}
}
