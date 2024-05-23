package com.dxc.Employeedata;

public class Employee {
	public static void main(String[]args) {
EmployeeDetails emp1 = new EmployeeDetails(); 
 emp1.setEmp_id(100);
 emp1.setEmpname("murali");
 emp1.setDesignation("DEV");
 emp1.setDepartment("Software");
 emp1.setLocation("bangalore");
 emp1.setSalary(50000);
 EmployeeDetails emp2 = new EmployeeDetails(); 
 emp2.setEmp_id(101);
 emp2.setEmpname("ganesh");
 emp2.setDesignation("Testing");
 emp2.setDepartment("Software");
 emp2.setLocation("chennai");
 emp2.setSalary(25000);
 System.out.println(emp1);
 System.out.println(emp2);

	}
	
}