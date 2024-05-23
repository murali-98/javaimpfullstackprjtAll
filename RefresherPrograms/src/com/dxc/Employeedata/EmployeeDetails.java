package com.dxc.Employeedata;
public class EmployeeDetails {
int Emp_id;
String Empname; 
String Designation;
String Department;
String Location; 
int Salary;

@Override
public String toString() {
	return "EmployeeDetails [Emp_id=" + Emp_id + ", Empname=" + Empname + ", Salary=" + Salary + ", Location="
			+ Location + ", Designation=" + Designation + ", Department=" + Department + "]";
}

public int getEmp_id() {
	return Emp_id;
}

public void setEmp_id(int emp_id) {
	Emp_id = emp_id;
}

public String getEmpname() {
	return Empname;
}

public void setEmpname(String empname) {
	Empname = empname;
}

public String getDesignation() {
	return Designation;
}

public void setDesignation(String designation) {
	Designation = designation;
}

public String getDepartment() {
	return Department;
}

public void setDepartment(String department) {
	Department = department;
}

public String getLocation() {
	return Location;
}

public void setLocation(String location) {
	Location = location;
}

public int getSalary() {
	return Salary;
}

public void setSalary(int salary) {
	Salary = salary;
}
}
