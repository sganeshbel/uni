package com.company.app.Entity;

import javax.persistence.Entity;

@Entity
@Table(name="")
public class test {

	@Column(name="email_id")
	private String Email;
	private String itemName;
	private int noOfItems;
	public test() {
		// TODO Auto-generated constructor stub
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getNoOfItems() {
		return noOfItems;
	}
	public void setNoOfItems(int noOfItems) {
		this.noOfItems = noOfItems;
	}
	
}
