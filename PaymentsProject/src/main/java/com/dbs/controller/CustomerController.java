package com.dbs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dbs.beans.Customer;
import com.dbs.service.CustomerService;

@Controller
public class CustomerController {

	@Autowired
	CustomerService customerService;
	
	@RequestMapping(value = "Customer",method = RequestMethod.POST)
	public Customer addCustomer(@RequestBody Customer customer) {
		System.out.println("function called");
		return customerService.addCustomer(customer);
	}
	
	
}
