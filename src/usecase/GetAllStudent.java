package usecase;

import java.util.List;

import Dao.StudentDao;
import Dao.StudentDaoImpl;
import module.Student;

public class GetAllStudent {

	public static void main(String[] args) {

		StudentDao s=new StudentDaoImpl();
		List<Student> list=s.getAllStudent();
		
		for(Student stu:list) {
			System.out.println(stu);
		}
		if(list.size()==0) {
			System.out.println("list is empty");
		}
		
	}

}
