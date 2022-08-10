package com.ezen.database.pizza.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ezen.database.dto.Pizza;
import com.ezen.database.pizza.mapper.PizzaMapperSub;

@Service
public class PizzaSeviceImpl implements PizzaService {
	
//	@Autowired
	PizzaMapperSub pizzaMapper;
//
	@Override
	public List<Pizza> getPizzaList() {
		return pizzaMapper.getAll();
	}

	@Override
	public Integer addPizza(Pizza pizza) {
		// pizza name에 unique가 걸려있다고 가정
		
		// 1. 피자를 추가한다
		int row = pizzaMapper.add(pizza);
		
		// 2. 방금 추가한 피자의 아이디는 시퀀스라 모르므로 이름으로 다시 가져온다
		if( row > 0) {
			return pizzaMapper.getIdByName(pizza);
		}else {
			return null;
		}
		
	}

	@Override
	public Pizza updatePizzaForm(int id) {
		// TODO Auto-generated method stub
		return pizzaMapper.getPizza(id);
	}

	@Override
	public Integer uptPizza(Pizza pizza) {
		
		// pizza 수정값에 대한 검사
		return pizzaMapper.uptPizza(pizza);
	}

}
