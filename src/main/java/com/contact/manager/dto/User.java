package com.contact.manager.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;





@Entity
public class User {
	@Id
	private Integer userId;
	private String userName;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Contact> contact;
	
	

	

	public User(Integer userId, String userName, List<Contact> contact) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.contact = contact;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	

	public List<Contact> getContact() {
		return contact;
	}

	public void setContact(List<Contact> contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", contact=" + contact + "]";
	}
	
	
	

}
