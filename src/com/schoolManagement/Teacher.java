package com.schoolManagement;

public class Teacher {

	private int id;
	private String name;
	private int salary;
	private int salaryEarned;
	
	public Teacher(int id, String name, int salary) {
		
		this.id = id;
		this.name = name;
		this.salary = salary;
		salaryEarned = 0;
		
	}
	
	public int getid() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	public int getsalary() {
		return salary;
	}
	public void setsalary() {
		salary = salary;
	}
	
	public void receivesalary(int salary) {
		salaryEarned = salaryEarned+salary;
		School.updateTotalMoneySpent(salary);
	}

	@Override
	public String toString() {
		return "Name of the Teacher : " + name +" Total salary earned so far $"+ salaryEarned;
	}

	
}
