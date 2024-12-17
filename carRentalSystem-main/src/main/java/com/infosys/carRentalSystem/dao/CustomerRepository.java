
package com.infosys.carRentalSystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infosys.carRentalSystem.bean.Customer;

public interface CustomerRepository extends JpaRepository<Customer ,String>{
	
}
