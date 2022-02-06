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

import com.bytetraining.springboot.model.Restaurant;
import com.bytetraining.springboot.service.RestaurantService;

@RestController
public class RestaurantController {

	@Autowired
	RestaurantService restaurantService;

	@PostMapping("/restaurant/login")
	private Restaurant getRestaurant(@RequestBody Map<String, String> json) {
		int restaurantId = Integer.parseInt(json.get("restaurantId"));
		String password = json.get("password");

		Restaurant restaurant = restaurantService.getRestaurant(restaurantId);

		if (restaurant.getPassword().equals(password)) {
			System.out.println("Login Successful!");
			return restaurant;
		} else {
			System.out.println("Login Failed!");
			return null;
		}
	}

	@GetMapping("/restaurant/view")
	private List<Restaurant> viewRestaurants() {
		return restaurantService.viewRestaurants();
	}

	@GetMapping("/restaurant/view={restaurantId}")
	private Restaurant viewRestaurantById(@PathVariable int restaurantId) {
		return restaurantService.viewRestaurantById(restaurantId);
	}

	@PostMapping("/restaurant/add")
	private void addRestaurant(@RequestBody Restaurant restaurant) {
		restaurantService.addOrUpdateRestaurant(restaurant);
	}

	@PutMapping("/restaurant/update")
	private void updateRestaurant(@RequestBody Restaurant restaurant) {
		restaurantService.addOrUpdateRestaurant(restaurant);
	}

	@DeleteMapping("/restaurant/delete={restaurantId}")
	private void deleteRestaurant(@PathVariable("restaurantId") int restaurantId) {
		restaurantService.deleteRestaurant(restaurantId);
	}
}
