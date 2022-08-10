package com.ezen.database.pizza.mapper;

import java.util.List;

import com.ezen.database.dto.Pizza;

public interface PizzaMapperSub {
	
	public List<Pizza> getAll();
	
	public int add(Pizza pizza);
	
	public Integer getIdByName(Pizza pizza);	
	
	public Pizza getPizza(int id);
	
	public Integer uptPizza(Pizza pizza);

}
