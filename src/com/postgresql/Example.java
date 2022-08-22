package com.postgresql;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Example {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("org.postgresql.Driver");
		String url = "jdbc:postgresql://localhost:5432/venkat";
		Connection connection = DriverManager.getConnection(url);
		if(connection!=null)
			System.out.println("connection established");
		Statement statement=connection.createStatement();
		int x=statement.executeUpdate("insert into COMPANY(id,name,age,address,salary) values(134,'deepu',24,'Bayonne',12440)");
        if(x!=0)
        	System.out.println("record inserted");
        int y=statement.executeUpdate("insert into COMPANY(id,name,age,address,salary) values(153,'deepika',25,'Bayonne',12490)");
        if(y!=0)
        	System.out.println("updated");
        String z = "Delete from COMPANY where id= 134";
        statement.executeUpdate(z);
        System.out.println("Deleted");
	}

}

