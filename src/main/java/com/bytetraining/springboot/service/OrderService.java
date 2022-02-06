package com.bytetraining.springboot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bytetraining.springboot.model.Orders;
import com.bytetraining.springboot.repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	OrderRepository orderRepository;
	
	public void placeOrder(Orders order) {
		orderRepository.save(order);
	}

	public List<Orders> viewCustomerOrders(String customerUsername) {
		List<Orders> orderList = new ArrayList<Orders>();
		orderRepository.viewCustomerOrders(customerUsername).forEach(order -> orderList.add(order));

		return orderList;
	}

	public List<Orders> viewRestaurantOrders(int restaurantId) {
		List<Orders> orderList = new ArrayList<Orders>();
		orderRepository.viewRestaurantOrders(restaurantId).forEach(order -> orderList.add(order));

		return orderList;
	}
}
