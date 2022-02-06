package com.bytetraining.springboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.bytetraining.springboot.model.Restaurant;

public interface RestaurantRepository extends CrudRepository<Restaurant, Integer> {

}
