package com.schoolManagement;

public class Student {

	private int id;
	private String name;
	private int grade;
	private int feespaid;
	private int feesTotal;
	
	public Student(int id, String name, int grade) {
		feespaid =0;
		feesTotal =30000;
		this.id = id;
		this.name = name;
		this.grade = grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	 public void payfess(int fees) {
		 feespaid+=fees;
	 }
	 
	  public int getid () {
		  return id;
	  }
	  
	public String getName() {
		return name;
	}
	
	public int getGrade() {
		return grade;
	}
	
	public int getfeesTotal() {
		return feesTotal;
	}
	
	public int getfeesPaid() {
		return feespaid;
	}
	
	public int getRemainingFees() {
		return feesTotal-feespaid;
	}
	
	@Override
	public String toString() {
		return "student's name :"+name+"Total fees paid so far $"+feespaid;
	}
	
	
}
