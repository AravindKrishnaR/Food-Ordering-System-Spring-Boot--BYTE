package com.bytetraining.springboot.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bytetraining.springboot.model.Admin;
import com.bytetraining.springboot.service.AdminService;

@RestController
public class AdminController {
	
	@Autowired
	AdminService adminService;
	
	@PostMapping("/admin/login")
	private Admin getAdmin(@RequestBody Map<String, String> json) {
		String username = json.get("username");
		String password = json.get("password");
		
		Admin admin = adminService.getAdmin(username);
		
		if(admin.getPassword().equals(password)) {
			System.out.println("Login Successful!");
			return admin;
		}
		else {
			System.out.println("Login Failed!");
			return null;
		}
	}
}
