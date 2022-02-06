package com.bytetraining.springboot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bytetraining.springboot.model.Food;
import com.bytetraining.springboot.repository.FoodRepository;

@Service
public class FoodService {
	
	@Autowired
	FoodRepository foodRepository;
	
	public void addFood(Food food) {
		foodRepository.save(food);
	}
	
	public List<Food> viewFoodByRestaurant(int restaurantId) {
		List<Food> foodList = new ArrayList<Food>();
		foodRepository.viewFoodByRestaurant(restaurantId).forEach(food -> foodList.add(food));
		
		return foodList;
	};
	
	public List<Food> viewFoodByCategory(String category) {
		List<Food> foodList = new ArrayList<Food>();
		foodRepository.viewFoodByCategory(category).forEach(food -> foodList.add(food));;
		
		return foodList;
	}
	
	public List<String> viewCategory() {
		List<String> categoryList = new ArrayList<String>();
		foodRepository.viewCategory().forEach(category -> categoryList.add(category));
		
		return categoryList;
	}
	
	public void deleteFood(int foodId) {
		foodRepository.deleteById(foodId);
	}
}
