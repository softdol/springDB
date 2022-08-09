package com.ezen.database.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ezen.database.dto.Pizza;
import com.ezen.database.mapper.PizzaMapper;

import lombok.extern.log4j.Log4j2;

@RequestMapping("/pizza")
@Controller
@Log4j2
public class PizzaController {
	
	@Autowired
	PizzaMapper pizzaMapper;
	
	@GetMapping({"/",""})
	public String index() {
		return "redirect:/pizza/list";
	}

	@GetMapping("/list")
	public void list(Model model) {
		model.addAttribute("pizzas", pizzaMapper.getList());
	}
	
	@GetMapping("/add")
	public void add() {
		
	}
	
	@PostMapping("/add")
	public String setAdd(Pizza pizza) {
		
		try {
			
			if(pizza.getName() == null || pizza.getPrice() == null || pizza.getCalories() == null) {
				return "redirect:/pizza/add";
			}
			
			if(!pizzaMapper.addPizza(pizza.getName(), pizza.getPrice(), pizza.getCalories())){
				log.info("피자 등록 실패 : " + pizza.getName());
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return "redirect:/pizza/list";
	}
	
	@GetMapping("/info")
	public void view(Integer id) {
		log.info(id);
		
	}
	
}
