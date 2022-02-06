package com.bytetraining.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bytetraining.springboot.model.Food;
import com.bytetraining.springboot.service.FoodService;

@RestController
public class FoodController {

	@Autowired
	FoodService foodService;
	
	@PostMapping("/restaurant/food")
	private void addFood(@RequestBody Food food) {
		foodService.addFood(food);
	}
	
	@GetMapping("/restaurant/food/restaurant={restaurantId}")
	private List<Food> viewFood(@PathVariable int restaurantId) {
		return foodService.viewFoodByRestaurant(restaurantId);
	} 
	
	@GetMapping("/customer/food/restaurant={restaurantId}")
	private List<Food> viewFoodByRestaurant(@PathVariable int restaurantId) {
		return foodService.viewFoodByRestaurant(restaurantId);
	}
	
	@GetMapping("/customer/food/category={category}")
	private List<Food> viewFoodByCategory(@PathVariable String category) {
		return foodService.viewFoodByCategory(category);
	}
	
	@GetMapping("/customer/food/category")
	private List<String> viewCategory() {
		return foodService.viewCategory();
	}
	
	@DeleteMapping("/restaurant/food")
	private void deleteFood(int foodId) {
		foodService.deleteFood(foodId);
	}
}
