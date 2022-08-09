package com.ezen.database.mapper;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ezen.database.dto.Employee;

import lombok.extern.log4j.Log4j2;

@Log4j2
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
	"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml",
	"file:src/main/webapp/WEB-INF/spring/root-context.xml"
})
public class MapperTest {
	
	@Autowired
	EmployeeMapper mapper;

	@Test
	@Ignore
	public void getAllEmployees() {
		List<Employee> employees = mapper.getList();
		
		for(Employee e : employees) {
			log.info(e.getFirst_name() + " " + e.getLast_name());
		}
	}
	
	@Test
	public void findById() {
		Employee emp = mapper.findById(103);
		
		log.info(emp);
		
		assertNotNull(emp);
	}

}
