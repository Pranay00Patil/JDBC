package com.git.teacher;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TeacherDelete {
public static void main(String[] args) {
	String url ="jdbc:mysql://localhost:3306/school";
	String username ="root";
	String password ="Root";
	
	String sql = "DELETE FROM teacher where teacher_id=1";
	Connection connect =null;
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		connect =DriverManager.getConnection(url, username, password);
		Statement state =connect.createStatement();
		int a  = state.executeUpdate(sql);
		if (a>0)
			System.out.println("Data is deleted");
		else
			System.out.println("Data is not deleted");
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
