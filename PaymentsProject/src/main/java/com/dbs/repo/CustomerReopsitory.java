/**
 * 
 */
package com.dbs.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dbs.beans.Customer;

@Repository
public interface CustomerReopsitory extends JpaRepository<Customer, String> {

}
