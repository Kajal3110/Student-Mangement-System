package com.StudentManagement.Info;

public class StudentInformation {
	
	int Student_id;
	String Student_name;
	String password;
	

	public StudentInformation(int Student_id, String Student_name, String password) {
		super();
		this.Student_id = Student_id;
		this.Student_name = Student_name;
		this.password = password;
	}

	public StudentInformation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getStudent_id() {
		return Student_id;
	}

	public void setStudent_id(int student_id) {
		Student_id = student_id;
	}

	public String getStudent_name() {
		return Student_name;
	}

	public void setStudent_name(String student_name) {
		Student_name = student_name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	}
    	
	


