package Dao;
import java.util.List;
import module.Student;


public interface StudentDao {
	
	public String registerStudent(Student student);
	
	public List<Student> getAllStudent();
	
	
	public Student getStudentById(int id) ;

	

}
