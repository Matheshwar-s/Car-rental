package com.infosys.carRentalSystem.dao;
import java.util.List;

import com.infosys.carRentalSystem.bean.Customer;

public interface CustomerDao{
	public void save(Customer customer);
	public Customer findById(String id);
	public List<Customer> findAll();
	public void deleteCustomerById(String id);
	
}