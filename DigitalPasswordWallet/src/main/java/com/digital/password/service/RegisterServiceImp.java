package com.digital.password.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.digital.password.entity.RegisterBean;
import com.digital.password.repository.RegisterRepo;
import com.digital.password.util.EncryptDecryptPassword;
import com.digital.password.util.PasswordGenerator;
import com.digital.password.util.SendMail;

@Service
public class RegisterImp implements RegisterService {

	@Autowired
	private RegisterRepo registerRepo;
	@Autowired
	private SendMail sendMail;

	public RegisterImp() {
		System.out.println(this.getClass().getName());
	}

	public boolean registerMethod(RegisterBean register) {
		// TODO Auto-generated method stub
		boolean userExist = false;
		Long userCount = registerRepo.getUser(register.getEmail());
		if (userCount == 0) {
			String unencryptedString = PasswordGenerator.generatePassword();
			System.out.println("Newly generated Password" + " " + unencryptedString);

			register.setAccountLock(0);
			register.setFirstTimeUser(0);
			register.setSecurePhrase(null);

			EncryptDecryptPassword encdecrptPassword;
			try {
				encdecrptPassword = new EncryptDecryptPassword();
				String encryptedString = encdecrptPassword.encryptPassword(unencryptedString);
				System.out.println("Encrypted Password" + " " + encryptedString);
				register.setPassword(encryptedString);

			} catch (Exception e) {
				System.err.println(e.getMessage());
			}

			// sendMail.sendMail(registerEntity);
			registerRepo.registerMethod(register);
			sendMail.sendMimeMail(register);
			return userExist;

		} else {

			return userExist = true;

		}
	}
}