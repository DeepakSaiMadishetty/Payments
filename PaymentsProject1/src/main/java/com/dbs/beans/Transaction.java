package com.dbs.beans;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Transaction {

	@Id
	@GeneratedValue
	Integer transaction_id;
	Date transaction_date;
	String transaction_type;
	double transaction_amount;
	String customer_id;
	String receiver_id;
	String receiver_name;
	String receiver_bic;
	String transaction_status;
	String message_code;
	public Integer getTransaction_id() {
		return transaction_id;
	}
	public void setTransaction_id(Integer transaction_id) {
		this.transaction_id = transaction_id;
	}
	public Date getTransaction_date() {
		return transaction_date;
	}
	public void setTransaction_date(Date transaction_date) {
		this.transaction_date = transaction_date;
	}
	public String getTransaction_type() {
		return transaction_type;
	}
	public void setTransaction_type(String transaction_type) {
		this.transaction_type = transaction_type;
	}
	public double getTransaction_amount() {
		return transaction_amount;
	}
	public void setTransaction_amount(double transaction_amount) {
		this.transaction_amount = transaction_amount;
	}
	public String getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}
	public String getReceiver_id() {
		return receiver_id;
	}
	public void setReceiver_id(String receiver_id) {
		this.receiver_id = receiver_id;
	}
	public String getReceiver_name() {
		return receiver_name;
	}
	public void setReceiver_name(String receiver_name) {
		this.receiver_name = receiver_name;
	}
	public String getReceiver_bic() {
		return receiver_bic;
	}
	public void setReceiver_bic(String receiver_bic) {
		this.receiver_bic = receiver_bic;
	}
	public String getTransaction_status() {
		return transaction_status;
	}
	public void setTransaction_status(String transaction_status) {
		this.transaction_status = transaction_status;
	}
	public String getMessage_code() {
		return message_code;
	}
	public void setMessage_code(String message_code) {
		this.message_code = message_code;
	}
	@Override
	public String toString() {
		return "Transaction [transaction_id=" + transaction_id + ", transaction_date=" + transaction_date
				+ ", transaction_type=" + transaction_type + ", transaction_amount=" + transaction_amount
				+ ", customer_id=" + customer_id + ", receiver_id=" + receiver_id + ", receiver_name=" + receiver_name
				+ ", receiver_bic=" + receiver_bic + ", transaction_status=" + transaction_status + ", message_code="
				+ message_code + "]";
	}
	public Transaction(Integer transaction_id, Date transaction_date, String transaction_type,
			double transaction_amount, String customer_id, String receiver_id, String receiver_name,
			String receiver_bic, String transaction_status, String message_code) {
		super();
		this.transaction_id = transaction_id;
		this.transaction_date = transaction_date;
		this.transaction_type = transaction_type;
		this.transaction_amount = transaction_amount;
		this.customer_id = customer_id;
		this.receiver_id = receiver_id;
		this.receiver_name = receiver_name;
		this.receiver_bic = receiver_bic;
		this.transaction_status = transaction_status;
		this.message_code = message_code;
	}
	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}
	
		
	
	
	
}
