package com.digital.password.util;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import com.digital.password.entity.RegisterBean;

@Component
public class SendMail {

	@Autowired
	private SimpleMailMessage mailMessage;

	@Autowired
	private JavaMailSender mailSource;

	public SendMail() {
		System.out.println("created\t" + this.getClass().getSimpleName());
	}

	public boolean sendMail(RegisterBean registerEntity) {
		Boolean mailflag = false;
		String mailSubject = "Password Reset";
		String email = registerEntity.getEmail();
		System.out.println(email);
		try {
			mailMessage.setTo(email);
			mailMessage.setSubject(mailSubject);
			mailMessage.setText("<html>\n" + "<body>\n" + "Hello\n" + "Your Password is:" + registerEntity.getPassword()
					+ "\n" + "For Password Reset click here \n" + "<a href='password change'>\n"
					+ "This is the link</a>\n" + "</body>\n" + "</html>\n");
			System.out.println("start sending mail");
			mailSource.send(mailMessage);
			System.out.println("mail  has been sent");
			return Boolean.TRUE;
		} catch (Exception exp) {
			System.err.println(exp.getMessage());
			exp.printStackTrace();

		}
		return mailflag;
	}

	public boolean sendMimeMail(RegisterBean registerEntity) {

		Boolean mailflag = false;
		String mailSubject = "Password Reset";
		String email = registerEntity.getEmail();
		System.out.println(email);

		MimeMessage mimeMessage = this.mailSource.createMimeMessage();
		try {
			mimeMessage.setSubject(mailSubject);
		

			MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
			helper.setTo(registerEntity.getEmail());
			
			 String msg="<html><p>Hi!</p><p>Your password is: "+registerEntity.getPassword()+"</p><a href='http://localhost:8080/DigitalPasswordWallet/changePsw'>Click here for PSW Change</a><p>Thanks</p><p><Digital Wallet Group></p></html>";
			 String psw=registerEntity.getPassword();
			 System.out.println(psw);
			
			helper.setText(msg, true);
			System.out.println("start sending mail");
			mailSource.send(mimeMessage);
			System.out.println("mail  has been sent");
			return Boolean.TRUE;
		} catch (Exception exp) {
			System.err.println(exp.getMessage());
			exp.printStackTrace();
		}

		return mailflag;

	}

}
