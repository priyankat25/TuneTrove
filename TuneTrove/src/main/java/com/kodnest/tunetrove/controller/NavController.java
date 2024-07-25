package com.kodnest.tunetrove.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavController {
	
	@GetMapping("/home")
	public String home() {
		return "index";
	}
	
	@GetMapping("/about")
	public String about() {
		return "about";
	}
	
	@GetMapping("/login")
	public String login() {
		return "login";		
	}
	
	@GetMapping("/registration")
	public String registration(){
		return "registration";
	}
	
	@GetMapping("/newsong")
	public String newsong(){
		return "newsong";
		
	}
}