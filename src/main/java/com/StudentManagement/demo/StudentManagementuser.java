package com.StudentManagement.demo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

import javax.print.attribute.standard.DateTimeAtCompleted;
import javax.print.attribute.standard.DateTimeAtCreation;

public class StudentManagementuser {
	DatabaseConnectivity ob=new DatabaseConnectivity();
	Connection conn=ob.dbConnection();
	
	public boolean login(long sid,String password) throws SQLException 
	{
		
		PreparedStatement ps=conn.prepareStatement("select * from StudentManagement_user where student_id=? && password=?");
		ps.setLong(1, sid);
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
	
	
	public void Enrollment(long uid,double EnrollmentNumber) 
	{
		try
		{
		PreparedStatement ps=conn.prepareStatement("select * from StudentManagement_user where student_id=?");
		ps.setLong(1, uid);
		
		ResultSet result=ps.executeQuery();
		double Enrollment=0.0;
		
			while(result.next())
			{
				EnrollmentNumber=result.getDouble(6);
			}
			
		
		
		
		if(EnrollmentNumber<=EnrollmentNumber)
		{
			EnrollmentNumber=EnrollmentNumber-EnrollmentNumber;
			PreparedStatement ps1=conn.prepareStatement("update studentManagement_user set Enrollment_Number=? where student_id=?");
			ps1.setDouble(1, Enrollment);
			ps1.setLong(2, uid);
			ps1.executeUpdate();
			
			System.out.println("Registration Successfull!!!");
			System.out.println("Remaining Student:"+Enrollment);
			
			
			
		}
		else
		{
			System.out.println("Still Student not Enrollment!!");
			
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		
	}
	
	
	public void Batch(long uid,double BatchId)
	{
		try
		{
		PreparedStatement ps=conn.prepareStatement("select * from StudentManagement_user where student_id=?");
		ps.setLong(1, uid);
		
		ResultSet result=ps.executeQuery();
		double EnrollmentAmount=0.0;
		
			while(result.next())
			{
				EnrollmentAmount=result.getDouble(6);
			}
			
			EnrollmentAmount=EnrollmentAmount+BatchId;
		
			PreparedStatement ps1=conn.prepareStatement("update StudentManagement_user set Enrollment Amount=? where student_id=?");
			ps1.setDouble(1, EnrollmentAmount);
			ps1.setLong(2, uid);
			ps1.executeUpdate();
			
			System.out.println(" Registration Successfull!!!");
			System.out.println("New Enrollment:"+EnrollmentAmount);

			
		}
		catch(Exception e)
		{
			System.out.println("Problem in execution!!");
		}
	}
	
	
	public void EnrollmentAmount(long uid)
	{
		try
		{
		PreparedStatement ps=conn.prepareStatement("select * from StudentMangement_user where Student_id=?");
		ps.setLong(1, uid);
		
		ResultSet result=ps.executeQuery();
		double EnrollmentAmount=0.0;
		
			while(result.next())
			{
				EnrollmentAmount=result.getDouble(6);
			}
		System.out.println("Student Enrollment:"+EnrollmentAmount);	
		}
		catch(Exception e)
		{
			System.out.println("Problem in Registration!!");
		}
	}
	
public void Department(long sid,String password) throws SQLException
{
	PreparedStatement ps=conn.prepareStatement(" select dept from StudentManagement_user where  password=? && student_id=? ");
	ps.setString(1, password);
	ps.setLong(2, sid);
	int affectedRows=ps.executeUpdate();
	if(affectedRows>0)
	System.out.println("dept");
	else
		System.out.println("Something wrong");
}
	

	
		
	public boolean changePassword(long studentId,String newPassword) throws SQLException
	{
		PreparedStatement ps=conn.prepareStatement("update StudentManagement_user set password=? where student_id=? ");
		ps.setString(1, newPassword);
		ps.setLong(2, studentId);
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
	
	public void TypeOfStudent(long sid,long rid,double EnrollmentNumber) throws SQLException
	{
		Savepoint s1=null,s2=null,s3=null;
		try
		{
			// EnrollmentNumber updation
		conn.setAutoCommit(false);
		PreparedStatement ps=conn.prepareStatement("select * from StudentMangement_user where Student_id=? ");
		ps.setLong(1, rid);
		ResultSet result=ps.executeQuery();
		double Enrollment1=0.0;
		
			while(result.next())
			{
				EnrollmentNumber=result.getDouble(6);
			}
			
			EnrollmentNumber=EnrollmentNumber+0.0;
		    s1=conn.setSavepoint();
			PreparedStatement ps1=conn.prepareStatement("update bank_user set available_balance=? where acc_id=? ");
			ps1.setDouble(1, EnrollmentNumber);
			ps1.setLong(2, rid);
			int affectedRows=ps1.executeUpdate();
			
			//EnrollmentNumber Updation
			
			
			PreparedStatement ps3=conn.prepareStatement("select * from bank_user where acc_id=? ");
			ps3.setLong(1, sid);
			ResultSet result1=ps3.executeQuery();
			double Enrollment2=0.0;
			double EnrollmentAmount=0.0;
			
				while(result1.next())
				{
				EnrollmentAmount=result1.getDouble(6);
				}
				EnrollmentNumber=EnrollmentNumber+EnrollmentAmount;
				s2=conn.setSavepoint();
				PreparedStatement ps4=conn.prepareStatement("update StudentMagement_user set Enrollment_Amount=? where Student_id=? ");
				ps4.setDouble(1, EnrollmentNumber);
				ps4.setLong(2, sid);
				int a=ps4.executeUpdate();
				
				
				Random r=new Random();
				long tid=r.nextInt(9999);
				
				java.util.Date now=new java.util.Date();
				java.sql.Timestamp sqlTS=new java.sql.Timestamp(now.getTime());
				
				s3=conn.setSavepoint();
				PreparedStatement ps5=conn.prepareStatement("insert into Type of Student values(?,?,?,?,?) ");
				ps5.setLong(1, rid);
				ps5.setDouble(2, EnrollmentNumber);
				ps5.setTimestamp(3,sqlTS);
				ps5.setLong(4, rid);
				ps5.setLong(5, sid);
				affectedRows=ps5.executeUpdate();
				
				if(affectedRows>0)
				{
					System.out.println("Student Registration Successfull!!");
				}
				else
				{
					System.out.println("Student Registration Failed!!");
				}
				conn.commit();
									
		}
		catch(Exception e)
		{
			conn.rollback(s1);
			conn.commit();
			System.out.println(e.getMessage());
			System.out.println("Something went wrong!!");
		}
				
		
	}
	
	public ResultSet TypeOfStudent(long studentId)
	{
		ResultSet result=null;
		try
		{
		PreparedStatement ps=conn.prepareStatement("select * from Type of Student where sender_student_id=? ");
		ps.setLong(1, studentId);
		result=ps.executeQuery();
		
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println("Something went wrong!!");
		}
		return result;
	}


}
	
	
	


