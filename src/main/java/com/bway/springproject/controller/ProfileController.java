package com.bway.springproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class ProfileController {
	
	@GetMapping("/profile")
	public String getProfile(HttpSession session) {
		if(session.getAttribute("validuser")== null) {
			return "LoginForm";
		}
		return "profile";
	}
	@PostMapping("/profile")
	public String postProfile() {
		return "profile";
	}
	
}