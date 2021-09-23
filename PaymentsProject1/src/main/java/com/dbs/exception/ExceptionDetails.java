package com.dbs.exception;

import java.util.*;

public class ExceptionDetails {

	String message;
	Date date;
	String information;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getInformation() {
		return information;
	}
	public void setInformation(String information) {
		this.information = information;
	}
	@Override
	public String toString() {
		return "ExceptionDetails [message=" + message + ", date=" + date + ", information=" + information + "]";
	}
	public ExceptionDetails(String message, Date date, String information) {
		super();
		this.message = message;
		this.date = date;
		this.information = information;
	}
	public ExceptionDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
