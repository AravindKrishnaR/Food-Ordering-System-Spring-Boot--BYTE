package com.bytetraining.springboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.bytetraining.springboot.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, String> {

}
