package com.ezen.database.pizza.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ezen.database.dto.Pizza;

public interface PizzaService {
	
	public List<Pizza> getPizzaList();
	public Integer addPizza(Pizza pizza);
	public Pizza updatePizzaForm(int id);
	public Integer uptPizza(Pizza pizza);

}
