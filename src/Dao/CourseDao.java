package Dao;

import java.util.List;

import module.Course;

public interface CourseDao {
	
	public String registerCourse(Course course);
	
	public List<Course> getAllCourse();
	
	public Course getCourseByID(int id);
	
	public String deleteCourseById(int id);


}
