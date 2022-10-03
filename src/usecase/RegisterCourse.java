package usecase;

import java.util.Scanner;

import Dao.CourseDao;
import Dao.CourseDaoImpl;
import module.Course;

public class RegisterCourse {

	public static void main(String[] args) {
		
		CourseDao c=new CourseDaoImpl();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the course name..");
		String course=sc.next();
		System.out.println("enter the course fees");
		int fee= sc.nextInt();
		System.out.println("Enter course Duration");
		sc.nextLine();
		String duration=sc.nextLine();
		
		
		
		
		
		String res=c.registerCourse(new Course(course, fee, duration));
		System.out.println(res);

	}

}
