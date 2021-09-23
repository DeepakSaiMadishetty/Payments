package com.dbs.beans;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
	
	@Id
	String customer_id;
	String customer_name;
	double account_balance;
	String overdraft;

	@Override
	public String toString() {
		return "Customer [customer_id=" + customer_id + ", customer_name=" + customer_name + ", account_balance="
				+ account_balance + ", overdraft=" + overdraft + "]";
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String customer_id, String customer_name, double account_balance, String overdraft) {
		super();
		this.customer_id = customer_id;
		this.customer_name = customer_name;
		this.account_balance = account_balance;
		this.overdraft = overdraft;
	}
	public String getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public double getAccount_balance() {
		return account_balance;
	}
	public void setAccount_balance(double account_balance) {
		this.account_balance = account_balance;
	}
	public String getOverdraft() {
		return overdraft;
	}
	public void setOverdraft(String overdraft) {
		this.overdraft = overdraft;
	}
	
//	public Customer() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	public Customer(String customer_id, String customerName, double accountBalance, String overdraft) {
//		super();
//		this.customer_id = customer_id;
//		this.customerName = customerName;
//		this.accountBalance = accountBalance;
//		this.overdraft = overdraft;
//	}
		

}
