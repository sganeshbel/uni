package com.digital.password.util;

import java.security.SecureRandom;

import org.springframework.stereotype.Component;
@Component
public class PasswordGenerator {

	private static SecureRandom secureRandom = new SecureRandom();
	
	
	private static final String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	private static final String numbers = "0123456789";
	private static final String splChar = "@!#$%^&*";
	private static final String passwordPattern = letters+numbers+splChar;

	public static String generatePassword() {
		int length = 10;
		

		String password = "";
		for(int i=0;i<length;i++){
			int index=secureRandom.nextInt(passwordPattern.length());
			password=password+passwordPattern.charAt(index);

			
		}
		return password;
	}
	
}
