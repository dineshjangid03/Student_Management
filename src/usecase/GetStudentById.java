package usecase;

import java.util.Scanner;

import Dao.StudentDao;
import Dao.StudentDaoImpl;
import module.Student;


public class GetStudentById {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the id of student");
	    int Id=sc.nextInt();
	   
	    StudentDao s=new StudentDaoImpl();
	    Student stu= s.getStudentById(Id);
	    
	    if(stu==null) {
	    	System.out.println("no student with this id");
	    }
	    else {
	    	System.out.println(stu);
	    }
	    

	}

}
