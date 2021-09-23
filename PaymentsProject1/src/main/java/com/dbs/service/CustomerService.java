package com.dbs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.beans.Customer;
import com.dbs.repo.CustomerRepository;

@Service
public class CustomerService implements ICustomerService {
	
	@Autowired
	CustomerRepository customerRepository;
	
	
	@Override
	public Customer addCustomer(Customer customer) {
		return customerRepository.save(customer);
	}
	
	@Override
	public Customer getCustomer(String id) {
		return customerRepository.findById(id).get();
	}
	

}
