package com.jnit.training.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/jnit?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String username ="root";
		String Password="Aug@2022";
		Connection connection =DriverManager.getConnection(url,username,Password);
		if(connection!=null)
			System.out.println("connection established");
		Statement statement=connection.createStatement();
		int x=statement.executeUpdate("insert into Employee values(1237,'fahal','ferran',123000,'Wipro','database engineer')");
        if(x!=0)
        	System.out.println("record inserted");
        String sql =  "update Employee set LastName='Bodapu',Salary=170000 where PERSONID = 1255" ;
            statement.executeUpdate(sql);
            System.out.println("updated");
            String a = "Delete from Employee where PERSONID= '1237'";
            statement.executeUpdate(a);
            System.out.println("Deleted");
           
	}

}
