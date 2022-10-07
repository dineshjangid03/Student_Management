package usecase;

import java.util.Scanner;
import Dao.StudentDao;
import Dao.StudentDaoImpl;

public class DeleteStudent {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter id of student which you want to delete");
		
		int id=sc.nextInt();
		
		StudentDao s=new StudentDaoImpl();
		
		String res= s.deleteStudentById(id);
		
		System.out.println(res);

	}

}