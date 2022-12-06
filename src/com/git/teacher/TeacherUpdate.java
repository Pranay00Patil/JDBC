package com.git.teacher;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TeacherUpdate {
	public static void main(String[] args) {
		String url ="jdbc:mysql://localhost:3306/school";
		String username ="root";
		String password ="Root";
		
		String sql="UPDATE teacher SET teacher_id=1 where teacher_id=3";
		Connection connect =null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
 connect = DriverManager.getConnection(url, username, password);
			Statement state =connect.createStatement();
			state.execute(sql);
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				connect.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
