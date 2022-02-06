package com.bytetraining.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.bytetraining.springboot.model.Orders;

public interface OrderRepository extends CrudRepository<Orders, Integer> {

	@Query(value = "SELECT * from Orders WHERE customer_username =:customerUsername ", nativeQuery = true)
	List<Orders> viewCustomerOrders(@Param("customerUsername") String customerUsername);

	@Query(value = "SELECT order_id, Orders.customer_username, Customer.name AS 'customerName', Food.restaurant_id, Restaurant.name, Orders.food_id, Food.name, Food.price "
			+ "from Orders "
			+ "JOIN Customer ON Orders.customer_username = Customer.username "
			+ "JOIN Food ON Food.food_id = Orders.food_id "
			+ "JOIN Restaurant ON Restaurant.restaurant_id = Food.restaurant_id "
			+ "WHERE Food.restaurant_id =:restaurantId ", nativeQuery = true)
	List<Orders> viewRestaurantOrders(@Param("restaurantId") int restaurantId);
}
