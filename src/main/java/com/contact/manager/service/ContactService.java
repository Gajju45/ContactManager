package com.contact.manager.service;

import java.util.List;

import com.contact.manager.dto.Contact;

public interface ContactService {
	Boolean addContact(Contact contact);
	Boolean deleteContact(Integer contactId);
	Contact getContactById(Integer contactId);
	Contact updateContact(Contact contact);
	public List<Contact> getContecctList();
	
	

}
