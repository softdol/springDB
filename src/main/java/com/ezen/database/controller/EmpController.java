package com.ezen.database.controller;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ezen.database.dto.Employee;
import com.ezen.database.mapper.EmployeeMapper;

import lombok.extern.log4j.Log4j2;

@RequestMapping("/employee")
@Controller
@Log4j2
public class EmpController {
	
	@Autowired	
	DataSource ds;
	
	@Autowired
	EmployeeMapper mapper;
	
	// 사원 목록을 모두 조회해야하는 여러가지 서비스
	// - 사원 해고 페이지
	// - 사원 월급 조정 페이지
	// - 사원 직위 조종 페이지
	
	@GetMapping("/fire")
	public void fire(Model model) {
//		log.info("마이바티스 테스트");
//		for(Employee emp : mapper.getList()) {
//			log.info(emp.getFirst_name() + " " + emp.getLast_name());
//		}
		Employee emp = mapper.findById(100);
	}

	@GetMapping("/list")
	public void list(Model model) {
		
//		List<Employee> employees = new ArrayList<>();
//		
//		try(
//				Connection conn = ds.getConnection();
//				PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM employees");
//				ResultSet rs = pstmt.executeQuery();
//		){
//			while(rs.next()) {
//				employees.add(new Employee(rs));
//				//log.info(rs.getInt(1));
//			}
//			
//		}catch (SQLException e) {
//			e.printStackTrace();
//		}		
		model.addAttribute("employees", mapper.getList());
	}
	
}
