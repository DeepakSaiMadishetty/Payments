package com.dbs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.dbs.beans.Customer;
import com.dbs.repo.CustomerReopsitory;

@Service
public class CustomerService {

	@Autowired
	CustomerReopsitory customerReopsitory;
	
	public Customer addCustomer(Customer customer) {
		return customerReopsitory.save(customer);
	}
}
