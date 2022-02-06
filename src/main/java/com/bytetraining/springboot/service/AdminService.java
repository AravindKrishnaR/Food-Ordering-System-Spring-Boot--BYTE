package com.bytetraining.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bytetraining.springboot.model.Admin;
import com.bytetraining.springboot.repository.AdminRepository;

@Service
public class AdminService {
	
	@Autowired
	AdminRepository adminRepository;
	
	public Admin getAdmin(String username) {
		return adminRepository.findById(username).get();
	}
}
