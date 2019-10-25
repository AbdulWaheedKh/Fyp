package com.javabrains.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/Regus")
public class HomeController {
	@RequestMapping("/")
	public String index() {
		return "index";
	}

}
