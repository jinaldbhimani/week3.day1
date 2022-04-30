package org.student;

import org.college.College;
import org.department.Department;

public class Student extends Department
{
public void studentName()
{
System.out.println("student name is Jinal Bhimani");	
}
public void studentDepartment() 
{
System.out.println("Student Department is I&c");	
}
public void studentId() 
{
System.out.println("stident id is 110420110055");	
}

public static void main(String[] args) {
	College college=new College();
	college.collegeCOde();
	college.collegeName();
	college.collegeRank();
	
	Department department=new Department();
	department.departmentName();
	
	Student student=new Student();
	student.studentName();
	student.studentDepartment();
	student.studentId();
}
}
