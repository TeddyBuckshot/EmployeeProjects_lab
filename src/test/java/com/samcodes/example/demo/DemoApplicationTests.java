package com.samcodes.example.demo;

import com.samcodes.example.demo.models.Department;
import com.samcodes.example.demo.models.Employee;
import com.samcodes.example.demo.models.Project;
import com.samcodes.example.demo.repositories.DepartmentRepo;
import com.samcodes.example.demo.repositories.EmployeeRepo;
import com.samcodes.example.demo.repositories.ProjectRepo;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class DemoApplicationTests {

	@Autowired
	EmployeeRepo employeeRepo;

	@Autowired
	DepartmentRepo departmentRepo;

	@Autowired
	ProjectRepo projectRepo;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployeeAndDeparment(){
		Department electrical = new Department("electrical");
		departmentRepo.save(electrical);
		Employee employee1 = new Employee("Sam", "Spencer", 3709, electrical);
		employeeRepo.save(employee1);
	}

	@Test
	public void createEmployeesAndProjects(){
		Project project1 = new Project("build house", 30);
		projectRepo.save(project1);
		Department electrical = new Department("electrical");
		departmentRepo.save(electrical);
		Employee employee1 = new Employee("Sam", "Spencer", 3709, electrical);
		employeeRepo.save(employee1);
		project1.addEmployee(employee1);
	}
}
