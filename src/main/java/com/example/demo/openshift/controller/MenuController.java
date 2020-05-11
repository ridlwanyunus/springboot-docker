package com.example.demo.openshift.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.openshift.model.User;
import com.example.demo.openshift.repository.UserRepository;

@Controller
public class MenuController {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@GetMapping(value="/")
	public String indexView() {
		return "index";
	}
	
	@GetMapping(value="/layout")
	public String layoutView() {
		return "layout";
	}
}
