package com.student;

import java.sql.ResultSet;
import java.util.Scanner;
import com.StudentManagement.demo.StudentManagementInformation;
import com.StudentManagement.demo.StudentManagementuser;

public class App 
{
    public static void main( String[] args )
    {
    	boolean status=true;
    	try
    	{
    		do
    		{
        Scanner scan=new Scanner(System.in);
        System.out.println("=======================================================================");
        System.out.println("                            Edubridge learning pvt ltd                        ");
        System.out.println("=======================================================================");
        System.out.println("1 -> Student Information");
        System.out.println("2 -> Student User");
        System.out.println("Enter your option:");
        int userType=scan.nextInt();
        
        if(userType==1)
        {
        	
        	System.out.println("Enter your Student id:");
        	int sid=scan.nextInt();
        	System.out.println("Enter Password:");
        	String password=scan.next();
        	
        	StudentManagementInformation ob=new StudentManagementInformation();
        	//System.out.println(ob.login(sid, password));
        	if(ob.login(sid, password))
        	{
                System.out.println("=======================================================================");
        		System.out.println("Login successfull!!");
                System.out.println("=======================================================================");
        		System.out.println("1.Student Open Account\r\n"
        				+ "2.Student Close Account\r\n"
        				+ "3.Student Check User Information\r\n"
        				+ "4.Password Change\r\n"
        				+ "5.Logout");
        	int op=scan.nextInt();
        	if(op==1)
        	{
        		System.out.println("Enter student account Id for the new user:");
        		long studentid=scan.nextLong();
        		System.out.println("Enter student name:");
        		String studentname=scan.next();
        		System.out.println("Enter student address:");
        		String studentaddress=scan.next();
        		System.out.println("Enter course fee :");
        		double coursefee=scan.nextDouble();
        		System.out.println("Set Password for the new user :");
        		String pass=scan.next();
        		if(ob.openAccount(studentid,studentname,studentaddress,coursefee,pass))
        		{
                    System.out.println("=======================================================================");
        			System.out.println(" Student Account created successfully!!");
                    System.out.println("=======================================================================");

        		}
        		else
        		{   System.out.println("=======================================================================");
        			System.out.println("Problem in student account creation!!");
                    System.out.println("=======================================================================");

        		}
        	}
        	else if(op==2)
        	{
        		System.out.println("Enter the Student Account Id for  student account closing:");
        		long studentId=scan.nextLong();
        		if(ob.accountClose(studentId))
        		{
        			System.out.println(" Student Account closed successfully!!");
        		}
        		else
        		{
        			System.out.println("Problem occurred!!");
        		}
        	}
        	
        	else if(op==3)
        	{
        		System.out.println("Enter User Student Account Id to check the Information:");
        		long studentId=scan.nextLong();
        		ResultSet result=ob.accountInfoCheck(studentId);
        		while(result.next())
        		{
        			System.out.println("=======================================================================");
        			System.out.println("--- Student Account Details ----");
                    System.out.println("=======================================================================");
                    System.out.println("Student Name :"+result.getString(2));
        			System.out.println("Student  Address :"+result.getString(3));
        			System.out.println("course fee:"+result.getDouble(6));
        			
        		}
        	}
        	
        	else if(op==4)
        	{
        		System.out.println("=======================================================================");
    			System.out.println("--- Password Change ----");
                System.out.println("=======================================================================");

        		System.out.println("Enter your Student ID:");
        		long sId=scan.nextLong();
        		System.out.println("Enter your New Password:");
        		String newPassword=scan.next();
        		if(ob.changePassword(sId, newPassword))
        		{
        			System.out.println("Password Changed Successfully!!");
        		}
        		else
        		{
        			System.out.println("Problem in password Changed!!");
        		}
        	}
        	
        	else if(op==5)
        	{
        		if(ob.logout())
        		{   
        			status=false;
        			System.out.println("=======================================================================");
                 
        			System.out.println("You are successfully logged out!!");
        			System.out.println("Thank You.");
        			System.out.println("=======================================================================");

        		}
        	}
        		
        		
        	}
        	else
        	{
        		System.out.println("Login unsuccessfull!!");
        	}
        	
        	
        }
        else if(userType==2)
        {
        	System.out.println("Enter your user id:");
        	long uid=scan.nextLong();
        	System.out.println("Enter Password:");
        	String password=scan.next();
        	
        	StudentManagementuser ob=new StudentManagementuser();
        	
        	if(ob.login(uid, password))
        	{
        		System.out.println("=======================================================================");
        		System.out.println("Login Successfull!!");
        		System.out.println("=======================================================================");

        		System.out.println("1.Enrollment\r\n"
        				+ "2.Batch\r\n"
        				+ "3.Enrollment Course Amount\r\n"
        				+ "4.Department\r\n"
        				+ "5.Change Password\r\n"
        				+ "6.Type of Student\r\n"
        				+ "7.Logout");
        		int operation=scan.nextInt();
        		
        		
        		if(operation==1)
        		{
        					
        		
        			System.out.println("Enter the Enrollment Number:");
        			double EnrollmentNumber=scan.nextDouble();      			
        			ob.Enrollment(uid, EnrollmentNumber);
       			
        		}
        		else if(operation==2)
        		{
        			System.out.println("Enter Batch Number:");
        			double BatchNumber=scan.nextDouble();
        			ob.Batch(uid, BatchNumber);
        		}
        		else if(operation==3)
        		{
        			
        			ob.EnrollmentAmount(uid);
        		}
        		
				
				  else if(operation==4) {
				  

	        			System.out.println("Dept:");
	            		Long sid=scan.nextLong();
	            		System.out.println("Stream:");
	            		Long stream=scan.nextLong();
	            		
	            		
	            		
	                    System.out.println("=======================================================================");
	            		ob.Department(sid,password);
	            		System.out.println("=======================================================================");

				  
				  }
				 
        		else if(operation==5)
        		{
        			
        			System.out.println("Enter your New Password:");
            		String newPassword=scan.next();
            		ob.changePassword(uid, newPassword);
            		System.out.println("=======================================================================");
            		System.out.println("Password Changed Successfully");
            		System.out.println("=======================================================================");

        		}
        		
        		else if(operation==6)
        		{
        			
        			
            		System.out.println("=======================================================================");
            		ResultSet r=ob.TypeOfStudent(uid);
        			System.out.println("Type of Student"+ "\s"+"Status"+"\s"+"Date"+"\s"+"Receiver Id"+"\s"+"Sender Id");
            		System.out.println("=======================================================================");

            		while(r.next())
            		{
            			System.out.println(r.getLong(1)+ "\s"+r.getDouble(2)+"\s"+r.getDate(3)+"\s"+r.getLong(4)+"\s"+r.getLong(5));
            		}
            		System.out.println("=======================================================================");

        		}
        		
        		else if(operation==7)
        		{
        			ob.logout();
        			status=false;
            		System.out.println("=======================================================================");
        			System.out.println("Logged Out!!");
            		System.out.println("=======================================================================");

        		}
        	}
        	else
        	{
        		System.out.println("=======================================================================");
        		System.out.println("Wrong Id or password!!");
        		System.out.println("=======================================================================");

        	}
        }
        else
        {
        	System.out.println("Please provide a valid input..!!");
        }
      }
    		while(status);		
    	}
    	catch(Exception e)
    	{
    		System.out.println(e.getMessage());
    	}
        
        
        
    }
}
