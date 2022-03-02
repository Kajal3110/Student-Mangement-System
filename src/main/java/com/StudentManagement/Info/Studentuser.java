package com.StudentManagement.Info;

public class Studentuser {
	
	int studentId;
	String studentName;
	String address;
	double coursefee;
	String password;
	
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getCoursefee() {
		return coursefee;
	}
	public void setCoursefee(double coursefee) {
		this.coursefee = coursefee;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Studentuser() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Studentuser(int studentId, String studentName, String address, double coursefee, String password) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.address = address;
		this.coursefee = coursefee;
		this.password = password;
	}
	
	
	
}
