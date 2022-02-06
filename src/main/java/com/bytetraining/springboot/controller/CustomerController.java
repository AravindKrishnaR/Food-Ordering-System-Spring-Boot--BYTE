package com.bytetraining.springboot.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bytetraining.springboot.model.Customer;
import com.bytetraining.springboot.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@PostMapping("/login/customer")
	private Customer getCustomer(@RequestBody Map<String, String> json) {
		String username = json.get("username");
		String password = json.get("password");
		
		Customer customer = customerService.getCustomer(username);
		
		if(customer.getPassword().equals(password)) {
			System.out.println("Login Successful!");
			return customer;
		}
		else {
			System.out.println("Login Failed!");
			return null;
		}
	}
	
	@GetMapping("/customers")
	private List<Customer> viewCustomers() {
		return customerService.viewCustomers();
	}
	
	@GetMapping("/customers/{username}")
	private Customer viewCustomerById(@PathVariable String username) {
		return customerService.viewCustomerById(username);
	}
	
	@PostMapping("/customers")
	private void addCustomer(@RequestBody Customer customer) {
		customerService.addOrUpdateCustomer(customer);
	}
	
	@PutMapping("/customers")
	private void updateCustomer(@RequestBody Customer customer) {
		customerService.addOrUpdateCustomer(customer);
	}
	
	@DeleteMapping("/customers/{username}")
	private void deleteCustomer(@PathVariable("username") String username) {
		customerService.deleteCustomer(username);
	}
}
