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
		// pizza name�� unique�� �ɷ��ִٰ� ����
		
		// 1. ���ڸ� �߰��Ѵ�
		int row = pizzaMapper.add(pizza);
		
		// 2. ��� �߰��� ������ ���̵�� �������� �𸣹Ƿ� �̸����� �ٽ� �����´�
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
		
		// pizza �������� ���� �˻�
		return pizzaMapper.uptPizza(pizza);
	}

}
