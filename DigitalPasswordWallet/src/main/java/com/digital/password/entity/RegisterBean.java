package com.digital.password.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "register")
public class RegisterBean implements Serializable {

	@Id
	@Column(name = "email")
	private String email;

	@Column(name = "user_name")
	private String userName;

	@Column(name = "mobile_no")
	private BigDecimal mobileNo;

	@Column(name = "type")
	private String type;

	@Column(name = "password")
	private String password;

	@Column(name = "secure_phrase")
	private String securePhrase;

	@Column(name = "firsttime_user")
	private Integer firstTimeUser;

	@Column(name = "accountLock")
	private Integer accountLock;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public BigDecimal getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(BigDecimal mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSecurePhrase() {
		return securePhrase;
	}

	public void setSecurePhrase(String securePhrase) {
		this.securePhrase = securePhrase;
	}

	public Integer getFirstTimeUser() {
		return firstTimeUser;
	}

	public void setFirstTimeUser(Integer firstTimeUser) {
		this.firstTimeUser = firstTimeUser;
	}

	public Integer getAccountLock() {
		return accountLock;
	}

	public void setAccountLock(Integer accountLock) {
		this.accountLock = accountLock;
	}
	
}
