package com.dbs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.beans.ExternalBank;
import com.dbs.service.IExternalBankService;

@RestController
public class ExternalBankController {

	@Autowired
	IExternalBankService externalBankService;
	
	@GetMapping(value = "bank/{id}")
	public ResponseEntity<ExternalBank> getBankById(@PathVariable String id) {
		return new ResponseEntity<>(externalBankService.getBankById(id),HttpStatus.OK);
	}
}


