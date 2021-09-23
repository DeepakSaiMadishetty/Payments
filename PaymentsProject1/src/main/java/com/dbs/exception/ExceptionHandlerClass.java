package com.dbs.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class ExceptionHandlerClass {

	@ExceptionHandler
	@ResponseStatus(value = HttpStatus.NOT_FOUND)
	public ResponseEntity<Object> customerNotFound(CustomerNotFoundException exception,WebRequest request) {
		
		ExceptionDetails exceptionDetails=new ExceptionDetails("There is no record of this person",new Date(),request.getDescription(false));
		return new ResponseEntity<>(exceptionDetails, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	public ResponseEntity<Object> otherExceptions(Exception exception,WebRequest request){
		
		ExceptionDetails exceptionDetails=new ExceptionDetails(exception.getMessage(),new Date(),request.getDescription(false));
		return new ResponseEntity<>(exceptionDetails, HttpStatus.INTERNAL_SERVER_ERROR);		
	}
	
	@ExceptionHandler
	@ResponseStatus(value = HttpStatus.NOT_ACCEPTABLE)
	public ResponseEntity<Object> checkInSDN(FoundInSDNException exception,WebRequest req){
		ExceptionDetails exceptionDetails=new ExceptionDetails("The receiver is found in the SDN list",new Date(),req.getDescription(false));
		return new ResponseEntity<>(exceptionDetails,HttpStatus.NOT_ACCEPTABLE);
	}
	
	
}
