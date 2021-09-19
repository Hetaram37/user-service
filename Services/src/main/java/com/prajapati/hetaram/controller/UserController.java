package com.prajapati.hetaram.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prajapati.hetaram.dto.SaveUserRequest;
import com.prajapati.hetaram.service.User;

@RestController
@RequestMapping("/api/user")
public class UserController {
	
	@Autowired
	private User user;
	
	@PostMapping(value = "/v1")
	private String newUser(@RequestBody SaveUserRequest body) {
		String result = user.addUser(body);
		return result;
	}

}
