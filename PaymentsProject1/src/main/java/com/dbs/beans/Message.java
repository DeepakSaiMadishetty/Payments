package com.dbs.beans;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Message {
	
	@Id
	String message_code;
	String message_instruction;
	public String getMessage_code() {
		return message_code;
	}
	public void setMessage_code(String message_code) {
		this.message_code = message_code;
	}
	public String getMessage_instruction() {
		return message_instruction;
	}
	public void setMessage_instruction(String message_instruction) {
		this.message_instruction = message_instruction;
	}
	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Message(String message_code, String message_instruction) {
		super();
		this.message_code = message_code;
		this.message_instruction = message_instruction;
	}
	@Override
	public String toString() {
		return "Message [message_code=" + message_code + ", message_instruction=" + message_instruction + "]";
	}
	
	

}
