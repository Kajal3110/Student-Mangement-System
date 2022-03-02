package com.StudentManagement.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DatabaseConnectivity {

	public Connection dbConnection()
	        {
				
				Connection conn=null;
		
				String databaseUrl="jdbc:mysql://localhost:3306/mydatabase";
				String userName="root";
				String userPassword="Kajju@3131";
				
				try
				{
					conn=DriverManager.getConnection(databaseUrl,userName,userPassword);
					
				}
				catch(SQLException e)
				{
					e.printStackTrace();
				}
				return conn;
	        }
	}
