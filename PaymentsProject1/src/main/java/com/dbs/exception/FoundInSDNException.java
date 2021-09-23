package com.dbs.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_ACCEPTABLE)
public class FoundInSDNException extends Exception{

	public FoundInSDNException() {
		super();
	}

	public FoundInSDNException(String message, Throwable cause) {
		super(message, cause);
	}

	public FoundInSDNException(String message) {
		super(message);
	}

	public FoundInSDNException(Throwable cause) {
		super(cause);
	}

	
}
