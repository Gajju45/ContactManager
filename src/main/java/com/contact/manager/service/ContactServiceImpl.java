package com.contact.manager.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.contact.manager.dao.ContactRepository;
import com.contact.manager.dto.Contact;


@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	ContactRepository contactRepository;

	@Override
	public Boolean addContact(Contact contact) {
		// TODO Auto-generated method stub
		this.contactRepository.save(contact);
		return true;
	}

	@Override
	public Boolean deleteContact(Integer contactId) {
		// TODO Auto-generated method stub
		this.contactRepository.deleteById(contactId);
		return true;
	}

	@Override
	public Contact getContactById(Integer contactId) {
		// TODO Auto-generated method stub
		Optional<Contact> contact = this.contactRepository.findById(contactId);

		return contact.get();
	}

	@Override
	public Contact updateContact(Contact contact) {
		
			
			
		contactRepository.save(contact);
		return contact;
	}

	@Override
	public List<Contact> getContecctList() {
		// TODO Auto-generated method stub
		return contactRepository.findAll();
	}

	
	

}
