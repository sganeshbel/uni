package com.digital.password.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.digital.password.entity.RegisterBean;
import com.digital.password.service.RegisterService;
import com.digital.password.util.Validation;

@Controller
public class RegisterController {

	@Autowired
	private RegisterService registerService;
	@Autowired
	private Validation validation;

	public RegisterController() {
		System.out.println(this.getClass().getName());
	}
	Logger logger = Logger.getLogger(RegisterController.class);

	@RequestMapping(value = "register", method = RequestMethod.POST)
	public ModelAndView registerMethod(RegisterBean register, Model model) {
		boolean isValidmail = validation.validateEmail(register);
		boolean isValidUser = validation.validateUser(register);
		boolean isValidMobile = validation.validateMobile(register);

		if (isValidmail) {
			if (isValidUser) {
				if (isValidMobile) {
					boolean userExist = registerService.registerMethod(register);
					if (userExist) {
						logger.info("user already exist");
						System.out.println("user already exist");
						model.addAttribute(register);
						return new ModelAndView("index.jsp","user exists",register.getUserName()+"you have already register");
					} else {
						//return "/home";
						return new ModelAndView("home.jsp","Register Success!!",register.getUserName());
						
					}
				} else {
					logger.error("mobile number is invalid");
					System.out.println("mobile invalid");
					//return "index";
					return new ModelAndView("index.jsp","Mobile invalid!!",register.getUserName());
					
				}
			}
			System.out.println("invalid user");
			return new ModelAndView("index.jsp","Invalid user!!",register.getUserName());
			

			//return "/index";
		} else {
			logger.error("invalid email");
			System.out.println("invalid mail");
			return new ModelAndView("index.jsp"," invalid mail!!",register.getUserName());
			
		}

	}
}
