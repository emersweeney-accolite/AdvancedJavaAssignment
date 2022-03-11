package com.au.glasgow.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.au.glasgow.model.Point;

@Service
@PropertySource("classpath:application.properties")
public class PointService {
	
	@Autowired
	private Environment env;
	
	public void printPoint() {
		Point point = new Point(Integer.parseInt(env.getProperty("point.x")), Integer.parseInt(env.getProperty("point.y")));
 		System.out.println(point);
	}
}

// Class Annotation that makes a bean of it
//@Controller - Rest end-points
//@Service - Business logic
//@Repository - JDBC 
//@Component - POJO
//@Configuration - Class whose methods initializes beans

// Method Annotation
//@Bean - Annotation to be given to method that returns a new object that is to be picked up as a bean

