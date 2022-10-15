package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import module.Student;
import utility.DButil;

public class StudentDaoImpl implements StudentDao {

	
	
	@Override
	public String registerStudent(Student student) {
		String msg="Not Resitered";

		try(Connection con=DButil.getConnection()) {
			
			PreparedStatement ps=con.prepareStatement("insert into student (name, mobile, address, age) values (?,?,?,?)");
			ps.setString(1, student.getName());
			ps.setString(2, student.getMobile());
			ps.setString(3,student.getAddress());
			ps.setInt(4,student.getAge());
			int x=ps.executeUpdate();
			if(x>0) {
				msg="Registered";
			}
			
		} catch (Exception e) {
			msg=e.getMessage();
		}
		
		return msg;

	}
	
	

	@Override
	public List<Student> getAllStudent() {
		List<Student> list=new ArrayList<>();
		
		try (Connection con=DButil.getConnection()){
			
			PreparedStatement ps=con.prepareStatement("select * from student;");
			
			ResultSet rs=ps.executeQuery();

			
			while(rs.next()) {
				
				int id=rs.getInt("id");
				String name=rs.getString("name");
				String mobile=rs.getString("mobile");
				String add=rs.getString("address");
				int age=rs.getInt("age");
				
				Student s=new Student(id, name, mobile, add, age);
				list.add(s);

			}
			
		} catch (Exception e) {
			
		}

		return list;
	}



	@Override
	public Student getStudentById(int id) {
		
		Student student=null;

		try(Connection con=DButil.getConnection()){
			PreparedStatement ps=con.prepareStatement("select * from student where id =?");
			
			ps.setInt(1, id);
			
			ResultSet rs=ps.executeQuery();
			
			if(rs.next()) {
				int id1=rs.getInt("id") ;
				String name=rs.getString("name");
				String mobile=rs.getString("mobile");
				String address=rs.getString("address");
				int age=rs.getInt("age");
				student=new Student(id,name,mobile,address,age) ;

			}
			
		}catch(Exception e) {}
		
		
		return student;
		
	}



	@Override
	public String deleteStudentById(int id) {
		String Message= "Not Deleted";
		try(Connection con=DButil.getConnection()){
			PreparedStatement ps=con.prepareStatement("Delete from student where id=?");
			ps.setInt(1,id);
			
			int x=ps.executeUpdate();
			
			if(x>0) {
				Message="course deleted";
			}
			
			
		} catch (Exception e) {
			Message=e.getMessage();
			
		}
		
		return Message;
	}



	@Override
	public List<Student> studentByCourse(int id) {
		ArrayList<Student> list=new ArrayList<>();
		

		try(Connection con=DButil.getConnection()){
			PreparedStatement ps=con.prepareStatement("select s.id, s.name, s.mobile, s.address, s.age from student s inner join course c inner join student_c sc on s.id=sc.sid and c.id=sc.cid and c.id=?");
			
			ps.setInt(1, id);
			
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) {
				int id1=rs.getInt("id") ;
				String name=rs.getString("name");
				String mobile=rs.getString("mobile");
				String address=rs.getString("address");
				int age=rs.getInt("age");
				Student student=new Student(id1,name,mobile,address,age) ;
				list.add(student);
			}
			
		}catch(Exception e) {}
		
		
		return list;
	}
	

}
