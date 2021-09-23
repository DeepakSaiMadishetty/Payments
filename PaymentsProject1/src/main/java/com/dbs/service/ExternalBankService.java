package com.dbs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.beans.ExternalBank;
import com.dbs.repo.ExternalBankRepository;

@Service
public class ExternalBankService implements IExternalBankService {

	@Autowired
	ExternalBankRepository externalBankRepository;
	
	@Override
	public ExternalBank getBankById(String id) {
		return externalBankRepository.findById(id).get();
	}
}
