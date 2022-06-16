package com.student.manage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Start {
	
	public static void main(String[] args) throws IOException
	{
	
	System.out.println("Welcome to Student Management App");
	
	while(true)
	{
		System.out.println("Enter 1 to add Student");
		System.out.println("Enter 2 to delete student");
		System.out.println("Enter 3 to Update student");
		System.out.println("Enter 4 to Display student");
		System.out.println("Enter 5 to exit");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		
		if(n==1)
		{
			//Add Student
			System.out.println("Enter Student name");
			String name=br.readLine();
			
			System.out.println("Enter Student phone no");
			String phone=br.readLine();
			
			System.out.println("Enter Student city");
			String city=br.readLine();
			
			Student st=new Student(name,phone,city);
			boolean f=StudentDao.InserttoDB(st);
			if(f==true)
			{
				System.out.println("Successfully");
			}
			else{
				System.out.println("not successfully");
			}
		}
		else if(n==2)
		{
			//Delete Student
			System.out.println("Enter studentId to delete");
			int id=Integer.parseInt(br.readLine());
			boolean f=StudentDao.DeletetoDB(id);
			if(f==true)
			{
				System.out.println("Successfully");
			}
			else{
				System.out.println("not successfully");
			}
			
		}
		else if(n==3)
		{
			//Update Student
			System.out.println("Enter studentId to Update");
			int id=Integer.parseInt(br.readLine());
			System.out.println("Enter Updated city");
			String ss=br.readLine();
			boolean f=StudentDao.UpdatetoDB(id,ss);
			if(f==true)
			{
				System.out.println("Successfully");
			}
			else{
				System.out.println("not successfully");
			}
			
		}
		else if(n==4)
		{
			//Display Student
			
			StudentDao.DisplaytoDB();
		}
		else if(n==5)
		{
			break;
		}
		else
		{
			
		}
	}
	
	}

}
