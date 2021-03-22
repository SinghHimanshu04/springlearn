package com.cognizant.springlearn.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.cognizant.springlearn.Department;


@Component
public class DepartmentDAO {

	static ArrayList<Department> DEPARTMENT_LIST;
	
	@SuppressWarnings("unchecked")
	public DepartmentDAO() {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("employee.xml");
		DEPARTMENT_LIST = (ArrayList<Department>) context.getBean("departmentList");
	}

	public List<Department> getAllDepartments() {
		return DEPARTMENT_LIST;
	}
}