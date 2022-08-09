package com.ezen.database.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ezen.database.dto.Employee;

import lombok.extern.log4j.Log4j2;

@RequestMapping("/employee")
@Controller
@Log4j2
public class EmpController {
	
	@Autowired	
	DataSource ds;
	
	// ��� ����� ��� ��ȸ�ؾ��ϴ� �������� ����
	// - ��� �ذ� ������
	// - ��� ���� ���� ������
	// - ��� ���� ���� ������
	
	@GetMapping("/fire")
	public void fire(Model model) {
	}

	@GetMapping("/list")
	public void list(Model model) {
		
		List<Employee> employees = new ArrayList<>();
		
		try(
				Connection conn = ds.getConnection();
				PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM employees");
				ResultSet rs = pstmt.executeQuery();
		){
			while(rs.next()) {
				employees.add(new Employee(rs));
				//log.info(rs.getInt(1));
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		model.addAttribute("employees", employees);
	}
	
}
