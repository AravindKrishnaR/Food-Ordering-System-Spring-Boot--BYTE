package com.bytetraining.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Orders {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "orderId", nullable = false)
	private int orderId;

	@Column(name = "customerUsername", nullable = false, length = 20)
	private String customerUsername;

//	@Transient
//	private String customerName;
//
//	@Transient
//	private int restaurantId;
//
//	@Transient
//	private String restaurantName;

	@Column(name = "foodId", nullable = false)
	private int foodId;

//	@Transient
//	private String foodName;
//
//	@Transient
//	private double price;

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getCustomerUsername() {
		return customerUsername;
	}

	public void setCustomerUsername(String customerUsername) {
		this.customerUsername = customerUsername;
	}

//	public String getCustomerName() {
//		return customerName;
//	}
//
//	public void setCustomerName(String customerName) {
//		this.customerName = customerName;
//	}
//
//	public int getRestaurantId() {
//		return restaurantId;
//	}
//
//	public void setRestaurantId(int restaurantId) {
//		this.restaurantId = restaurantId;
//	}
//
//	public String getRestaurantName() {
//		return restaurantName;
//	}
//
//	public void setRestaurantName(String restaurantName) {
//		this.restaurantName = restaurantName;
//	}

	public int getFoodId() {
		return foodId;
	}

	public void setFoodId(int foodId) {
		this.foodId = foodId;
	}

//	public String getFoodName() {
//		return foodName;
//	}
//
//	public void setFoodName(String foodName) {
//		this.foodName = foodName;
//	}
//
//	public double getPrice() {
//		return price;
//	}
//
//	public void setPrice(double price) {
//		this.price = price;
//	}
}
