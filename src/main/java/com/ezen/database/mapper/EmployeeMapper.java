package com.ezen.database.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.ezen.database.dto.Employee;

public interface EmployeeMapper {
		
	@Select("SELECT * FROM employees")
	public List<Employee> getList();
	
	@Select("SELECT * FROM employees where employee_id = #{id}")
	public Employee findById(@Param("id") long id);
	
	@Select("SELECT * FROM employees where first_name = #{name}")
	public Employee findByName(@Param("name") String name);
	
	@Select("SELECT * FROM employees where email = #{email}")
	public Employee findByEmail(@Param("email") String email);
	
	//@Insert("INSERT INTO employees() values()")
	

}
