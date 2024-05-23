package com.example.demo;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;

@EntityScan
public class Employee {
    
	@Id
	private String EmployeeName;
    private String EmployeeId;
    private String OganisationMail;
    private String Technology;
    private String Manager;
	
	public String getEmployeeName() {
		return EmployeeName;
	}
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
	public String getEmployeeId() {
		return EmployeeId;
	}
	public void setEmployeeId(String employeeId) {
		EmployeeId = employeeId;
	}
	public String getOganisationMail() {
		return OganisationMail;
	}
	public void setOganisationMail(String oganisationMail) {
		OganisationMail = oganisationMail;
	}
	public String getTechnology() {
		return Technology;
	}
	public void setTechnology(String technology) {
		Technology = technology;
	}
	public String getManager() {
		return Manager;
	}
	public void setManager(String manager) {
		Manager = manager;
	}
	@Override
	public String toString() {
		return "Employee [EmployeeName=" + EmployeeName + ", EmployeeId=" + EmployeeId
				+ ", OganisationMail=" + OganisationMail + ", Technology=" + Technology + ", Manager=" + Manager + "]";
	}
 
    
    
}