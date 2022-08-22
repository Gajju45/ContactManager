package com.contact.manager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.contact.manager.dto.Contact;
import com.contact.manager.service.ContactService;


@RestController
public class ContactController {

	@Autowired
	ContactService contactService;

	@PostMapping("contact")
	public String addContact(@RequestBody Contact contact) {
		this.contactService.addContact(contact);
		return "Add Successfully";

	}

	@GetMapping("contact/{contactId}")
	public Contact getContact(@PathVariable Integer contactId) {
		Contact contact = this.contactService.getContactById(contactId);
		return contact;
	}

	@DeleteMapping("contact/{contactId}")
	public String deleteContact(@PathVariable Integer contactId) {
		this.contactService.deleteContact(contactId);
		return "Delete Successfully";
	}


	
	@PutMapping("contact")
	public Contact updateContact(@RequestBody Contact contact) {
		return this.contactService.updateContact(contact);
	}

	@GetMapping("contact")
	public List<Contact> getContacts() {
		return this.contactService.getContecctList();
	}

}
