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
	
	@PostMapping("/customer/login")
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
	
	@GetMapping("/customer/view")
	private List<Customer> viewCustomers() {
		return customerService.viewCustomers();
	}
	
	@GetMapping("/customer/view={username}")
	private Customer viewCustomerById(@PathVariable String username) {
		return customerService.viewCustomerById(username);
	}
	
	@PostMapping("/customer/add")
	private void addCustomer(@RequestBody Customer customer) {
		customerService.addOrUpdateCustomer(customer);
	}
	
	@PutMapping("/customer/update")
	private void updateCustomer(@RequestBody Customer customer) {
		customerService.addOrUpdateCustomer(customer);
	}
	
	@DeleteMapping("/customer/delete={username}")
	private void deleteCustomer(@PathVariable("username") String username) {
		customerService.deleteCustomer(username);
	}
}
