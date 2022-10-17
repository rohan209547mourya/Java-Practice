package com.rohan.usecase;

import com.rohan.dao.TrainingDao;
import com.rohan.dao.impl.TraniningImpl;
import com.rohan.entity.Teacher;

public class AddTeacher {

	
	public static void main(String[] args) {
		
		
		Teacher teacher = new Teacher("Ratan Lal", 6, "ratan@gmail.com");
		
		
		TrainingDao obj = new TraniningImpl();
		
		obj.registerTeacher(teacher);
		
	}
}
