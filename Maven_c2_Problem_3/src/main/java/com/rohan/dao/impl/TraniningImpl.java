package com.rohan.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.rohan.Exception.CourseException;
import com.rohan.Exception.TeacherException;
import com.rohan.dao.TrainingDao;
import com.rohan.entity.Course;
import com.rohan.entity.Student;
import com.rohan.entity.Teacher;
import com.rohan.utility.GetConnection;

public class TraniningImpl implements TrainingDao{

	@Override
	public void addCourse(Course course) {
		
		EntityManager em = GetConnection.get();
		
		
		em.getTransaction().begin();
		
		em.persist(course);
		
		em.getTransaction().commit();
		
		em.close();
		
		System.out.println("Course Added !");
	}

	@Override
	public void registerStudent(Student student, int courseId) throws CourseException {
		
		
		EntityManager em = GetConnection.get();
		
		Course course = em.find(Course.class, courseId);
		
		
		em.getTransaction().begin();
		
		
		course.getStudents().add(student);
		student.getCourses().add(course);
		
		em.getTransaction().commit();
		em.close();
		
		System.out.println("Student Registered !" );
	}

	@Override
	public void registerTeacher(Teacher teacher) {
	
		EntityManager em = GetConnection.get();
		
		em.getTransaction().begin();
		
		
		
		em.persist(teacher);
		
		em.getTransaction().commit();
		
		
		em.close();
		
		System.out.println("Teacher addedd !" );
	}

	@Override
	public void assignTeacherWithCourse(int teacherId, int courseId) throws TeacherException, CourseException {
			
		
		EntityManager em = GetConnection.get();
		
		Course course = em.find(Course.class, courseId);
		
		Teacher teacher = em.find(Teacher.class, teacherId);
	
		
		if(course == null) {
			
			throw new CourseException("No course found with this id ");
		}
		
		if(teacher == null) {
			
			
			throw new TeacherException("No teacher found with this id");
		}
		
		em.getTransaction().begin();
		
		
		course.setTeacher(teacher);
		teacher.getCourses().add(course);
		
		em.getTransaction().commit();
		
		em.close();
		
		System.out.println("Course Assinged to teacher !");
	}

	@Override
	public List<Student> getAlltheStudentsByCourseName(String courseName) throws CourseException {
		
		List<Student> students = null;
		
		EntityManager em = GetConnection.get();
		
		Query query = em.createQuery("from Course where courseName = :name");
		
		query.setParameter("name", courseName);
		
		Course course =   (Course) query.getSingleResult();
		
		if(course == null) {
			
			throw new CourseException("No course found with this id ");
		}
		
		students = course.getStudents();
		
		return students;
	}

	
	
	
}
