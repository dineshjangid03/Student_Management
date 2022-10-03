package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import module.Course;
import module.Student;
import utility.DButil;

public class CourseDaoImpl implements CourseDao {

	@Override
	public String registerCourse(Course course) {
		String msg="Not Resigester.";
		try(Connection con=DButil.getConnection()){
			PreparedStatement cs=con.prepareStatement("insert into course (name,fees,duration)values(?,?,?)");
			cs.setString(1, course.getName());
			cs.setInt(2, course.getFees());
			cs.setString(3,course.getDuration());
			int x=cs.executeUpdate();
			if(x>0) {
				msg="Course Resigestered";
			}
			
		}catch(Exception e) {
			msg=e.getMessage();
		}
		return msg;
	}


	@Override
	public List<Course> getAllCourse() {
		
		List<Course>list=new ArrayList<>();
		
		try(Connection con=DButil.getConnection()){
			
			PreparedStatement ss=con.prepareStatement("select * from Course;");
			ResultSet vs=ss.executeQuery();
			while(vs.next()) {
				
				String name= vs.getString("name");
				int fees=vs.getInt("fees");
				String duration=vs.getString("duration");
				
				Course c= new Course(name,fees,duration);
				list.add(c);
				
			}
		}catch(Exception e) {
			
		}
		return list;
	}


	@Override
	public Course getCourseByID(int id) {
		
		return null;
	}
}
		
	


