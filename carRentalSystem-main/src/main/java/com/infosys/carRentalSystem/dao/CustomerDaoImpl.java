package com.infosys.carRentalSystem.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.infosys.carRentalSystem.bean.Customer;
@Service
@Repository

public class CustomerDaoImpl implements CustomerDao{
	@Autowired
	private CustomerRepository repository;
	
	@Override
	public void save(Customer customer) {
		repository.save(customer);
	}
	
	@Override
	public Customer findById(String id) {
		return repository.findById(id).get();
	}
	
	@Override
	public List<Customer> findAll() {
		return repository.findAll();
	}
	
	@Override
	public void deleteCustomerById(String id) {
		repository.deleteById(id);
	}
}