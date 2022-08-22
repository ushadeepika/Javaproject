package com.postgresql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Example2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("org.postgresql.Driver");
		String url = "jdbc:postgresql://localhost:5432/venkat";
		Connection connection = DriverManager.getConnection(url);
		if(connection!=null)
			System.out.println("connection established");
		Statement statement=connection.createStatement();
		ResultSet rs =statement.executeQuery("select  * from COMPANY");
		 while (rs.next()) {
			 System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4)+" "+rs.getInt(5));
		 }
		 ResultSet rs1 =statement.executeQuery("select NAME,AGE from COMPANY");
		 while (rs1.next()) {
			 System.out.println(rs1.getString(1)+" "+rs1.getInt(2));
		 }
		 ResultSet rs2 =statement.executeQuery("select * from COMPANY where  id=123");
		 while (rs2.next()) {
			 System.out.println(rs2.getString("ID"));
		 }
	}

}
