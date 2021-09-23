package com.dbs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.beans.Transaction;
import com.dbs.repo.TransactionRepository;

@Service
public class TransactionService implements ITransactionService {

	@Autowired
	TransactionRepository transactionRepository;

	@Override
	public Transaction insert(Transaction transaction) {
		return transactionRepository.save(transaction);
	}
	
	@Override
	public Transaction getDetails(int id) {
		return transactionRepository.findById(id).get();
	}
	
	@Override
	public java.util.List<Transaction> getAllTransactions() {
		return transactionRepository.findAll();
	}
	
	
}
