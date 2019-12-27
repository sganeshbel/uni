package com.company.app.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="orders")
public class OrdersEntity implements Serializable{
	@Id
	@Column(name="email")
private String email;
	@Column(name="item")
private String item;
	@Column(name="noOfItems")
private String noOfItems;
	
	public OrdersEntity() {
		System.out.println(this.getClass().getName());
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getNoOfItems() {
		return noOfItems;
	}

	public void setNoOfItems(String noOfItems) {
		this.noOfItems = noOfItems;
	}

	@Override
	public String toString() {
		return "OrdersEntity [email=" + email + ", item=" + item + ", noOfItems=" + noOfItems + "]";
	}
	
	
}
