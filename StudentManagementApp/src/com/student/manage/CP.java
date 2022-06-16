package com.student.manage;

import java.sql.Connection;
import java.sql.DriverManager;

public class CP{ 
	
	static Connection con;
	
	public static Connection CreactC()
	{
	
	try{
		//load the driver
		//loading of class not required
		//Class.forName("com.mysql.jdbc.Driver");
		
		//create the connection
		String user="root";
		String pass="ark80070";
		String url="jdbc:mysql://localhost:3306/student_manage";
		
		con=DriverManager.getConnection(url,user,pass);
		
		
	}
	catch(Exception e){
		e.printStackTrace();
		
	}
	return con;
	}

}
