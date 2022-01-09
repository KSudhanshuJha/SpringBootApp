package com.it.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.it.entity.UserRecord;
import com.it.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("/")
	public List<UserRecord> getAllUser() {
		return userService.getAllUsers();
	}

	@PostMapping(value = "/add-user")
	public void addUser(@RequestBody UserRecord userRecord) {
		userService.addUser(userRecord);
	}

}
