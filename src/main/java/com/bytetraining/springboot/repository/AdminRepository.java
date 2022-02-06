package com.bytetraining.springboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.bytetraining.springboot.model.Admin;

public interface AdminRepository extends CrudRepository<Admin, String> {

}
