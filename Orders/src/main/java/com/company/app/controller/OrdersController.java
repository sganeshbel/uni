package com.company.app.controller;

import org.springframework.stereotype.Controller;

@Controller
public class OrdersController {
public OrdersController() {
	System.out.println(this.getClass().getName()+" : created");
}
	
}
