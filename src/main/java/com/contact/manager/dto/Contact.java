package com.contact.manager.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Contact {
	@Id
	private Integer contactId;
	private String customerName;
	private String customerAddress;
	private String customerPhoneNumber;
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Contact(Integer contactId, String customerName, String customerAddress, String customerPhoneNumber) {
		super();
		this.contactId = contactId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.customerPhoneNumber = customerPhoneNumber;
	}
	public Integer getContactId() {
		return contactId;
	}
	public void setContactId(Integer contactId) {
		this.contactId = contactId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public String getCustomerPhoneNumber() {
		return customerPhoneNumber;
	}
	public void setCustomerPhoneNumber(String customerPhoneNumber) {
		this.customerPhoneNumber = customerPhoneNumber;
	}
	@Override
	public String toString() {
		return "Contact [contactId=" + contactId + ", customerName=" + customerName + ", customerAddress="
				+ customerAddress + ", customerPhoneNumber=" + customerPhoneNumber + "]";
	}
	
	


	
	

}
