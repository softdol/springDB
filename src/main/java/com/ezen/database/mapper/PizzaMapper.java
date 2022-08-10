package com.ezen.database.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.ezen.database.dto.Pizza;

public interface PizzaMapper {
	
	@Select("SELECT * FROM pizza ORDER BY id desc")
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
	
	@Delete("DELETE FROM pizza where id = #{id}")
	public Boolean delPizza(@Param("id") long id);
	
	@Update("UPDATE pizza SET name = #{pizza.name}"
			+ ", price = #{pizza.price}"
			+ ", calories = #{pizza.calories}"
			+ " WHERE id = #{pizza.id}")
	public Boolean uptPizza(@Param("pizza") Pizza pizza);
	
}
