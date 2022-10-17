package com.rohan.usecase;

import com.rohan.Exception.CourseException;
import com.rohan.dao.TrainingDao;
import com.rohan.dao.impl.TraniningImpl;
import com.rohan.entity.Student;

public class RegisterStudent {

	
	public static void main(String[] args) {
		
		
		
		Student stundent = new Student("Rohan Mourya", "Rohan@gmail.com", "9747434343");
		
		
		TrainingDao obj = new TraniningImpl();
		
		try {
			
			obj.registerStudent(stundent, 1);
		} 
		catch (CourseException e) {
		
			e.printStackTrace();
		}
		
	}
}
