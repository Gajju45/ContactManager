package com.contact.manager.service;


import java.util.List;

import com.contact.manager.dto.User;

public interface UserService {
	
	Boolean addUser(User user);
	Boolean deleteUser(Integer userId);
	User updateUser(User user);
	User getUserById(Integer userId);
	List<User> getAllUsers();


}
