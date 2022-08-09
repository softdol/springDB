package com.ezen.database.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.ezen.database.dto.Employee;
import com.ezen.database.dto.Pizza;

public interface PizzaMapper {
	
	@Select("SELECT * FROM pizza")
	public List<Pizza> getList();
	
	@Insert("INSERT INTO pizza(id, name, price, calories) VALUES("
			+ "pizza_id_seq.nextval, #{name}, #{price}, #{calories})")
	public Boolean addPizza(
			@Param("name") String	name,
			@Param("price") Integer price,
			@Param("calories") Double	calories
			);

	@Select("SELECT * FROM pizza where id = #{id}")
	public Pizza findById(@Param("id") long id);
}
