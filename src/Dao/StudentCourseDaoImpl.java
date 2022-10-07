package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import utility.DButil;

public class StudentCourseDaoImpl implements StudentCourseDao {

	@Override
	public String registerStudentIntoCourse(int studentid, int courseid) {
		String message="Not Allocate course to student";
		try(Connection con=DButil.getConnection()){
			PreparedStatement ps =con.prepareStatement("insert into student_course values(?,?)");
			ps.setInt(1, courseid);
			ps.setInt(2, studentid);
			
			int x=ps.executeUpdate();
			if(x>0) {
				message="student allocate to course";
			}
		}catch(Exception e) {
			
		}
		
		return message;
	}

}
