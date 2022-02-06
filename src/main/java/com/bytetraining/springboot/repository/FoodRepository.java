package com.bytetraining.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.bytetraining.springboot.model.Food;

public interface FoodRepository extends CrudRepository<Food, Integer> {
	@Query(value = "SELECT * from Food WHERE restaurant_id =:restaurantId ", nativeQuery = true)
	List<Food> viewFoodByRestaurant(@Param("restaurantId") int restaurantId);
	
	@Query(value = "SELECT * from FOOD WHERE category = :category ", nativeQuery = true)
	List<Food> viewFoodByCategory(@Param("category") String category);
	
	@Query(value = "SELECT distinct category from Food ", nativeQuery = true)
	List<String> viewCategory();
}
