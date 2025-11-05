package com.umfrancisco.burger;

public class Store {
	public static void main(String[] args) {
		Meal regularMeal = new Meal();
		System.out.println(regularMeal+"\n");
		
		Meal USRegularMeal = new Meal(0.68);
		System.out.println(USRegularMeal);
	}
}
