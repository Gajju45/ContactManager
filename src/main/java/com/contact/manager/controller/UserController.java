package com.contact.manager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.contact.manager.dto.Contact;
import com.contact.manager.dto.User;
import com.contact.manager.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("users")
	public String addUser(@RequestBody User user) {
		this.userService.addUser(user);
		return "User Added Succesfully";
	}
	
	@GetMapping("user/{userId}")
	public User getUser(@PathVariable Integer userId)
	{
		return this.userService.getUserById(userId);
		 
	}
	
	@DeleteMapping("user/{userId}")
	public String deleteUser(@PathVariable Integer userId) {
		this.userService.deleteUser(userId);
		return "delete Successfully";
	}
	
	//List
	@GetMapping("users")
	List<User> getUsers(){
		return userService.getAllUsers();
	}
	
	@PutMapping("users")
	public User updateUser(@RequestBody User user) {
		return this.userService.updateUser(user);
	}
	

}
