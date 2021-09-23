package com.dbs.controller;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.beans.Transaction;
import com.dbs.exception.FoundInSDNException;
import com.dbs.service.CheckInSDN;
import com.dbs.service.ITransactionService;

@RestController
public class TransactionController {

	@Autowired
	ITransactionService transactionService;
	
	
	CheckInSDN checkInSDN;
	
	@PostMapping("transaction")
	public ResponseEntity<Transaction> insert(@RequestBody Transaction transaction) throws FoundInSDNException {
		transaction.setTransaction_date(java.sql.Date.valueOf(LocalDate.now()));
		transaction.setTransaction_status("s");
		boolean flag=false;
		try {
			checkInSDN=new CheckInSDN();
			flag=checkInSDN.check(transaction.getReceiver_name());
		}
		catch(Exception e) {
			System.out.println("IO exception has occured");
		}
		if(flag){
			throw new FoundInSDNException("The receiver is found in SDN list");
		}		
		//System.out.println(transaction);
		return new ResponseEntity<Transaction>( transactionService.insert(transaction), HttpStatus.OK);
	}
	
	@GetMapping("transaction")
	public ResponseEntity< List<Transaction> >all() {
		return new ResponseEntity<List<Transaction>>( transactionService.getAllTransactions(), HttpStatus.OK);
	}
	
	@GetMapping("transaction/{id}")
	public ResponseEntity< Transaction> geTransaction(@PathVariable int id) {
		return new ResponseEntity<Transaction>(transactionService.getDetails(id), HttpStatus.OK) ;
	}
}
