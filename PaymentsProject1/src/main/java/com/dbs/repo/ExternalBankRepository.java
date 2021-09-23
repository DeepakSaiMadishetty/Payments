package com.dbs.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbs.beans.ExternalBank;

public interface ExternalBankRepository extends JpaRepository<ExternalBank, String> {

}
