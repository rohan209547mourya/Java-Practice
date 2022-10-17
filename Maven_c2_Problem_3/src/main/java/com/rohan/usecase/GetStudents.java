package com.rohan.usecase;

import com.rohan.Exception.CourseException;
import com.rohan.dao.TrainingDao;
import com.rohan.dao.impl.TraniningImpl;

public class GetStudents {

	
	public static void main(String[] args) {
		
		TrainingDao obj = new TraniningImpl();
		
		try {
			obj.getAlltheStudentsByCourseName("Java").forEach(s -> System.out.println(s));
		} 
		catch (CourseException e) {
			
			e.printStackTrace();
		}
	}
}
