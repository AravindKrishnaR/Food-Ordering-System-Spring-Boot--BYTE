package com.bytetraining.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bytetraining.springboot.model.Orders;
import com.bytetraining.springboot.service.OrderService;

@RestController
public class OrderController {
	
	@Autowired
	OrderService orderService;
	
	@PostMapping("/restaurants/orders")
	private void placeOrder(@RequestBody Orders order) {
		orderService.placeOrder(order);
	}
	
	@GetMapping("/customers/orders/{customerUsername}")
	private List<Orders> viewCustomerOrders(@PathVariable String customerUsername) {
		return orderService.viewCustomerOrders(customerUsername);
	}
	
	@GetMapping("/restaurants/orders/{restaurantId}")
	private List<Orders> viewRestaurantOrders(@PathVariable int restaurantId) {
		return orderService.viewRestaurantOrders(restaurantId);
	}
}
