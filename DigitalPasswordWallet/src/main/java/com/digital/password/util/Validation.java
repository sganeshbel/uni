package com.digital.password.util;

import org.springframework.stereotype.Component;

import com.digital.password.entity.RegisterBean;

@Component
public class Validation {

	public boolean validateEmail(RegisterBean registerBean) {
		boolean isValidEmail = false;
		String emailID = registerBean.getEmail();
		try {
			if (registerBean.getEmail() != null && !registerBean.getEmail().isEmpty()) {
				isValidEmail = true;
			}

		} catch (Exception e) {
			System.err.println(e);
		}
		return isValidEmail;

	}

	public boolean validateUser(RegisterBean registerBean) {
		boolean isValidUser = false;
		try {
			if (registerBean.getUserName() != null && !registerBean.getUserName().isEmpty()) {
				isValidUser = true;
			}

		} catch (Exception e) {
			System.err.println(e);
		}
		return isValidUser;

	}

	public boolean validateMobile(RegisterBean registerBean) {
		boolean isValidMobile = false;
		try {
			if (registerBean.getMobileNo() != null) {
				isValidMobile = true;
			}
		} catch (Exception e) {
			System.err.println(e);
		}
		return isValidMobile;

	}
}
