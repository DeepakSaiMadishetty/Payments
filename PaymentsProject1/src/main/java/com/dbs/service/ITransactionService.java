package com.dbs.service;

import com.dbs.beans.Transaction;

public interface ITransactionService {

	Transaction insert(Transaction transaction);

	Transaction getDetails(int id);

	java.util.List<Transaction> getAllTransactions();

}