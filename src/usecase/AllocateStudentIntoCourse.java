package usecase;

import java.util.Scanner;

import Dao.StudentCourseDao;
import Dao.StudentCourseDaoImpl;

public class AllocateStudentIntoCourse {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("enter the course id");
		int cid=sc.nextInt();
		System.out.println("enter the student id");
		int sid=sc.nextInt();
		
		StudentCourseDao s=new StudentCourseDaoImpl();
		String res=s.registerStudentIntoCourse(cid, sid);
		System.out.println(res);

	}

}