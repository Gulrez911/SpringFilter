package com.gul.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

//	private Logger logger = Logger.getLogger(HomeController.class);

	@GetMapping("/home")
	public String view() {
//		logger.info("View method called");
		System.out.println("testing");
		String ptr = null;
		if (ptr.equals("gfg"))
			System.out.print("Same");
		else
			System.out.print("Not Same");
		return "home";
	}

	@GetMapping("/error")
	@ResponseBody
	public String error() {
		System.out.println("error");
		 
		return "error";
	}
}
