package com.git.teacher;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TeacherInsert {
	public static void main(String[] args) {
		String url ="jdbc:mysql://localhost:3306/school";
		String username="root";
		String password ="Root";
		
		String sql = "INSERT INTO teacher VALUES(4,'Rob','Java')";
				Connection connect= null;
	   try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		connect = DriverManager.getConnection(url, username, password) ;
		Statement state = connect.createStatement();
		int a = state.executeUpdate(sql);
		if(a>0)
			System.out.println("Data is inserted");
		else
			System.out.println("Data is not inserted");
		
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
