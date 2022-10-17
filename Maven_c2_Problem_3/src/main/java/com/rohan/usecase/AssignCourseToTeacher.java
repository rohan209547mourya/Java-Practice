package com.rohan.usecase;

import com.rohan.Exception.CourseException;
import com.rohan.Exception.TeacherException;
import com.rohan.dao.TrainingDao;
import com.rohan.dao.impl.TraniningImpl;

public class AssignCourseToTeacher {
	
	public static void main(String[] args) {
		
		TrainingDao obj = new TraniningImpl();
		
		try {
			obj.assignTeacherWithCourse(3, 1);
		} 
		catch (TeacherException e) {
			
			e.printStackTrace();
		} 
		catch (CourseException e) {
			
			e.printStackTrace();
		}
		
		
	}
}
