package com.contact.manager.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.contact.manager.dao.UserRepository;
import com.contact.manager.dto.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired 
	UserRepository userRepository;
	@Override
	public Boolean addUser(User user) {
		// TODO Auto-generated method stub
		this.userRepository.save(user);
		return true;
	}

	@Override
	public Boolean deleteUser(Integer userId) {
		// TODO Auto-generated method stub
		this.userRepository.deleteById(userId);
		return true;
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
	
		userRepository.save(user);
		
	return user;
		
		
		
	}

	@Override
	public User getUserById(Integer userId) {
		// TODO Auto-generated method stub
	Optional<User> user2=	this.userRepository.findById(userId);
		return user2.get();
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		 return userRepository.findAll();
	}

	

}
