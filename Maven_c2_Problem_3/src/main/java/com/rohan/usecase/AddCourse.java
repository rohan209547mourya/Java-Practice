package com.rohan.usecase;

import com.rohan.dao.TrainingDao;
import com.rohan.dao.impl.TraniningImpl;
import com.rohan.entity.Course;

public class AddCourse {

	
	public static void main(String[] args) {
		
		
		Course course = new Course("Java", "4 Months", 12323);
		
		TrainingDao obj = new TraniningImpl();
		
		obj.addCourse(course);
		
	}
}
