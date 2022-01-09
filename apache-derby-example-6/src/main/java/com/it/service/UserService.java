package com.it.service;

import java.util.List;

import com.it.entity.UserRecord;

public interface UserService {

	public List<UserRecord> getAllUsers();

	public void addUser(UserRecord userRecord);

}
