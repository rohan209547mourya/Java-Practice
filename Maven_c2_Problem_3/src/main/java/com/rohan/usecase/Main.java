package com.rohan.usecase;

import com.rohan.Exception.CourseException;
import com.rohan.dao.TrainingDao;
import com.rohan.dao.impl.TraniningImpl;
import com.rohan.entity.Course;
import com.rohan.entity.Student;

public class Main {
	
	public static void main(String[] args) {
		
		
		TrainingDao obj = new TraniningImpl();
		
		
		try {
			obj.registerStudent(new Student("Rohan Mourya", "rohan@gmail.com", "973473843") , 1);
		} catch (CourseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
