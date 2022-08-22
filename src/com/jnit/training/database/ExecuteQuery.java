package com.jnit.training.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExecuteQuery {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/jnit?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String username ="root";
		String Password="Aug@2022";
		Connection connection =DriverManager.getConnection(url,username,Password);
		if(connection!=null)
			System.out.println("connection established");
		Statement statement=connection.createStatement();
		ResultSet rs =statement.executeQuery("select  * from Employee");
		 while (rs.next()) {
			 System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getString(5)+" "+rs.getString(6));
		 }
		 ResultSet rs1 =statement.executeQuery("select LastName,CompanyName from Employee");
		 while (rs1.next()) {
			 System.out.println(rs1.getString(1)+" "+rs1.getString(2));
		 }
		 ResultSet rs2 =statement.executeQuery("select * from Employee where PERSONID =1234");
		 while (rs2.next()) {
			 System.out.println(rs2.getString("PERSONID"));
		 }
		 }

	}


