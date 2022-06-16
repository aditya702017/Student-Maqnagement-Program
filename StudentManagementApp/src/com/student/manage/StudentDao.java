package com.student.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDao {
	
	public static boolean InserttoDB(Student st)
	{
		boolean flag =true;
		try{
			Connection con=CP.CreactC();
			String q="insert into students(sname,sphone,scity) values(?,?,?)";
			PreparedStatement pstms=con.prepareStatement(q);
			pstms.setString(1, st.getName());
			pstms.setString(2, st.getPhone());
			pstms.setString(3, st.getCity());
			
			pstms.executeUpdate();
			
		
			flag=true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return flag;
	}
	
	public static boolean DeletetoDB(int id)
	{
		boolean flag =true;
		try{
			Connection con=CP.CreactC();
			String q="delete from students where sid=?";
			PreparedStatement pstms=con.prepareStatement(q);
			pstms.setInt(1, id);
			
			
			pstms.executeUpdate();
			
		
			flag=true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return flag;
	}
	
	public static void DisplaytoDB()
	{
		
		try{
			Connection con=CP.CreactC();
			String q="select * from students";
			Statement st=con.createStatement();
			
			ResultSet rs=st.executeQuery(q);
			
			while(rs.next())
			{
				int id=rs.getInt(1);
				String name=rs.getString(2);
				String phone=rs.getString(3);
				String city=rs.getString(4);
				System.out.println("Id"+" "+id);
				System.out.println("Name"+" "+name);
				System.out.println("phone"+" "+phone);
				System.out.println("city"+" "+city);
				System.out.println("___________________");
			}
			
		
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

	public static boolean UpdatetoDB(int id, String ss) {
		// TODO Auto-generated method stub
		boolean flag =true;
		try{
			Connection con=CP.CreactC();
			String q="update students set scity=? where sid=?";
			PreparedStatement pstms=con.prepareStatement(q);
			pstms.setInt(2, id);
			pstms.setString(1, ss);
			
			
			
			pstms.executeUpdate();
			
		
			flag=true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return flag;
		
	}

}
