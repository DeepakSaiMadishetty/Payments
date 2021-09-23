package com.dbs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.beans.Customer;
import com.dbs.service.ICustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	ICustomerService iCustomerService;
	
	@PostMapping("customer")
	public ResponseEntity<Customer> insert(@RequestBody Customer customer) {
		return new ResponseEntity<>(iCustomerService.addCustomer(customer), HttpStatus.OK);
	}
	
	@GetMapping("customer/{id}")
	public ResponseEntity<Customer> getDetails(@PathVariable("id") String id) {
		System.out.println(id);
		Customer result = iCustomerService.getCustomer(id);
		System.out.println(result);
		return new ResponseEntity<Customer>(result,HttpStatus.OK);
	}
	

}
