package com.bytetraining.springboot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bytetraining.springboot.model.Restaurant;
import com.bytetraining.springboot.repository.RestaurantRepository;

@Service
public class RestaurantService {
	
	@Autowired
	RestaurantRepository restaurantRepository;

	public Restaurant getRestaurant(int restaurantId) {
		return restaurantRepository.findById(restaurantId).get();
	}

	public List<Restaurant> viewRestaurants() {
		List<Restaurant> restaurantList = new ArrayList<Restaurant>();
		restaurantRepository.findAll().forEach(restaurant -> restaurantList.add(restaurant));

		return restaurantList;
	}

	public Restaurant viewRestaurantById(int restaurantId) {
		return restaurantRepository.findById(restaurantId).get();
	}

	public void addOrUpdateRestaurant(Restaurant restaurant) {
		restaurantRepository.save(restaurant);
	}

	public void deleteRestaurant(int restaurantId) {
		restaurantRepository.deleteById(restaurantId);
	}
}
