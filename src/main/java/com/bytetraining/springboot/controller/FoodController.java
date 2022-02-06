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
	
	@PostMapping("/restaurants/food")
	private void addFood(@RequestBody Food food) {
		foodService.addFood(food);
	}
	
	@GetMapping("/restaurants/menu/{restaurantId}")
	private List<Food> viewFoodByRestaurant(@PathVariable int restaurantId) {
		return foodService.viewFoodByRestaurant(restaurantId);
	}
	
	@GetMapping("/food/categories/{category}")
	private List<Food> viewFoodByCategory(@PathVariable String category) {
		return foodService.viewFoodByCategory(category);
	}
	
	@GetMapping("/food/categories")
	private List<String> viewCategory() {
		return foodService.viewCategory();
	}
	
	@DeleteMapping("/restaurants/food/{foodId}")
	private void deleteFood(@PathVariable int foodId) {
		foodService.deleteFood(foodId);
	}
}
