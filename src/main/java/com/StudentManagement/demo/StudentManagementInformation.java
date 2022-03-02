package com.StudentManagement.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentManagementInformation {
	
	DatabaseConnectivity ob=new DatabaseConnectivity();
	Connection conn=ob.dbConnection();
	
	public boolean login(int sid,String password) throws SQLException 
	{
		
		PreparedStatement ps=conn.prepareStatement("select * from StudentManagement_information where s_id=? && password=?");
		ps.setInt(1, sid);
		ps.setString(2, password);
		ResultSet result=ps.executeQuery();
		
		
			if(result.next())
			{
				return true; 
			}
			else
			{
				return false;
			}
			
		
	}		
	
	public boolean openAccount(long student_id,String student_name,String student_address,double course_fee,String password) throws SQLException
	{
		PreparedStatement ps=conn.prepareStatement("insert into StudentManagement_information values(?,?,?,?,?,?,?)");
		ps.setLong(1, student_id);
		ps.setString(2, student_name);
		ps.setString(3, student_address);
		ps.setDouble(4,course_fee);
		ps.setString(5, password);
		
		int affectedRows=ps.executeUpdate();
		
		if(affectedRows>0)
			return true;
		else
			return false;
	}
	
	public boolean accountClose(long student_Id) throws SQLException
	{
		PreparedStatement ps=conn.prepareStatement("delete from StudentManagement_user where student_id=?");
		ps.setLong(1, student_Id);
		int affectedRows=ps.executeUpdate();
		if(affectedRows>0)
			return true;
		else
			return false;
	}
	
	
	public ResultSet accountInfoCheck(long student_Id) throws SQLException	
	{
		PreparedStatement ps=conn.prepareStatement("select * from StudentManagement_user where student_id=?");
		ps.setLong(1, student_Id);
		ResultSet result=ps.executeQuery();
		return result;
	}
	
	
	public boolean changePassword(long s_Id,String newPassword) throws SQLException
	{
		PreparedStatement ps=conn.prepareStatement("update StudentManagement_information set password=? where s_id=? ");
		ps.setString(1, newPassword);
		ps.setLong(2, s_Id);
		int affectedRows=ps.executeUpdate();
		
		if(affectedRows>0)
			return true;
		else
			return false;
	}
	
	public boolean logout() throws SQLException
	{
		conn.close();
		return true;
	}
	
	
	

}
