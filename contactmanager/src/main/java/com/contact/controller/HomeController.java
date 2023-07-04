package com.contact.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.contact.dao.UserRepository;
import com.contact.entities.User;


@Controller
public class HomeController {
	
	@Autowired
	private UserRepository  userRepository;
	
	
	@GetMapping("/test")
	@ResponseBody
	public String test() {
		
		User user = new User();
		user.setName("alok sharma");
		user.setEmail("alok@gmail.com");
		
		
		
		userRepository.save(user);
		
		
		
		return "Application working...........";
		
	}

}
