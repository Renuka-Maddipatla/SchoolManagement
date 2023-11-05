package com.schoolManagement;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Teacher jyothi = new Teacher(1,"lizzy",500);
		Teacher jyo = new Teacher(2,"bhun",7600);
		Teacher hggd = new Teacher (3,"bhgg",8700);
		List<Teacher> teacherlist = new ArrayList<>();
		
	teacherlist.add(jyothi);
	teacherlist.add(jyo);
	teacherlist.add(hggd);
	
		Student bhavi = new Student(1,"tam",4);
		Student hari = new Student(2,"tgdd",10);
		Student madhu = new Student(3,"hhsgd",14);
		List<Student> studentlist = new ArrayList<>();
		
		studentlist.add(bhavi);
		studentlist.add(hari);
		studentlist.add(madhu);
		
		School ghs = new School(teacherlist,studentlist);
		
		Teacher megan = new Teacher(6,"megan",900);
		ghs.addStudent(madhu);
		madhu.payfess(200);
	System.out.println("-------Making School Pay Salary-----");
	jyothi.receivesalary(jyothi.getsalary());
	System.out.println("GHS has spent for salary to " +jyothi.getName() + "and nowhas $" + ghs.getTotalMoneySpent());
		System.out.println(madhu);
	hggd.receivesalary(5000);
	System.out.println(hggd);
	bhavi.setGrade(3);
	System.out.println(bhavi);
	}

}
