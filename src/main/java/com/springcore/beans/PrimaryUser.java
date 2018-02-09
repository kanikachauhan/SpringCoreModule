package com.springcore.beans;

import java.util.List;

public class PrimaryUser extends User{

	private int sweets;
	private List<String> dishes;
	public int getSweets() {
		return sweets;
	}
	public void setSweets(int sweets) {
		this.sweets = sweets;
	}
	public List<String> getDishes() {
		return dishes;
	}
	public void setDishes(List<String> dishes) {
		this.dishes = dishes;
	}
	
	
}
