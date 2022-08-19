package com.ezen.database.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ezen.database.dto.Employee;

public interface EmployeeMapperXML {
	
	public List<Employee> getList();
	
	public List<Employee> getListByDept(int department_id);
	
	public List<Employee> getListBetDept(
			@Param("lowerD") int lowerD, 
			@Param("upperD") int upperD);

}
