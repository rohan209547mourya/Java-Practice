package com.rohan.dao;

import java.util.List;

import com.rohan.Exception.CourseException;
import com.rohan.Exception.TeacherException;
import com.rohan.entity.Course;
import com.rohan.entity.Student;
import com.rohan.entity.Teacher;

public interface TrainingDao {

	
	public void addCourse(Course course);
	
	public void registerStudent(Student student, int courseId)throws CourseException;
	
	public void registerTeacher(Teacher teacher);
	
	public void assignTeacherWithCourse(int teacherId, int courseId) throws	TeacherException, CourseException;
	
	public List<Student> getAlltheStudentsByCourseName(String courseName)throws	CourseException;


}
