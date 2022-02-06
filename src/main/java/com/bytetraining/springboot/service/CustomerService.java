package com.bytetraining.springboot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bytetraining.springboot.model.Customer;
import com.bytetraining.springboot.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	CustomerRepository customerRepository;

	public Customer getCustomer(String username) {
		return customerRepository.findById(username).get();
	}

	public List<Customer> viewCustomers() {
		List<Customer> customerList = new ArrayList<Customer>();
		customerRepository.findAll().forEach(customer -> customerList.add(customer));

		return customerList;
	}
	
	public Customer viewCustomerById(String username) {
		return customerRepository.findById(username).get();
	}
	
	public void addOrUpdateCustomer(Customer customer) {
		customerRepository.save(customer);
	}
	
	public void deleteCustomer(String username) {
		customerRepository.deleteById(username);
	}
}
