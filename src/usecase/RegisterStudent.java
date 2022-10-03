package usecase;

import java.util.Scanner;

import Dao.StudentDao;
import Dao.StudentDaoImpl;
import module.Student;

public class RegisterStudent {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter name of student");
		String name=sc.nextLine();
				
		System.out.println("Enter mobile of student");
		String mobile=sc.next();
		
		System.out.println("Enter Address of student");
		sc.nextLine();
		String add=sc.nextLine();
		
		System.out.println("Enter age of student");
		int age=sc.nextInt();
		
		StudentDao s=new StudentDaoImpl();
		
		String result=s.registerStudent(new Student(name,mobile,add,age));
		
		System.out.println(result);

	}

}
