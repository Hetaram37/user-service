package com.prajapati.hetaram.service.impl;

import org.springframework.stereotype.Service;

import com.prajapati.hetaram.dto.SaveUserRequest;
import com.prajapati.hetaram.service.User;

@Service
public class UserImpl implements User {

	@Override
	public String addUser(SaveUserRequest user) {
		System.out.print("User data: " + user.toString());
		return "User added";
	}

}
