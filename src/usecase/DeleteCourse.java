package usecase;
import java.util.Scanner;

import Dao.CourseDao;
import Dao.CourseDaoImpl;
public class DeleteCourse {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id of course which you want to delete");
		
		int id=sc.nextInt();
		
		CourseDao c=new CourseDaoImpl();
		String res=c.deleteCourseById(id);
		
		System.out.println(res);
		

	}

}