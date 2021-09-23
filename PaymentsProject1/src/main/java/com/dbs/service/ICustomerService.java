package com.dbs.service;

import com.dbs.beans.Customer;

public interface ICustomerService {

	Customer addCustomer(Customer customer);
	Customer getCustomer(String id) ;

}