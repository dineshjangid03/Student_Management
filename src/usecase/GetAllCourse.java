package usecase;
import java.util.List;

import Dao.CourseDao;
import Dao.CourseDaoImpl;
import module.Course;

public class GetAllCourse {

	public static void main(String[] args) {
		CourseDao a= new CourseDaoImpl();
		List<Course>list=a.getAllCourse();
		for(Course cur:list) {
			System.out.println(cur);
		}
		if(list.size()==0) {
			System.out.println("this is course is empty....");
		}

	}
		
}
