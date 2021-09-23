package com.dbs.beans;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ExternalBank {

	@Id
	String bic_code;
	String bank_name;
	public String getBic_code() {
		return bic_code;
	}
	public void setBic_code(String bic_code) {
		this.bic_code = bic_code;
	}
	public String getBank_name() {
		return bank_name;
	}
	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}
	public ExternalBank(String bic_code, String bank_name) {
		super();
		this.bic_code = bic_code;
		this.bank_name = bank_name;
	}
	public ExternalBank() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ExternalBank [bic_code=" + bic_code + ", bank_name=" + bank_name + "]";
	}
	
	
	
}
