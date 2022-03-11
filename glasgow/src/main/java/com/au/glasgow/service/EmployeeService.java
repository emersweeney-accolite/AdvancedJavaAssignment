package com.au.glasgow.service;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

import com.au.glasgow.config.AppConfig;
import com.au.glasgow.model.Employee;

@Service
public class EmployeeService {
	
	private static ApplicationContext context;
	
	public ArrayList<Employee> getAllEmployees() {
		System.out.println("Method getAllEmployees() called");
		
		context = new AnnotationConfigApplicationContext(AppConfig.class);
		@SuppressWarnings("unchecked")
		ArrayList<Employee> employees = (ArrayList<Employee>) context.getBean("Employee");
		
		return employees;
	}
}
