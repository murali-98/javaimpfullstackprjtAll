package com.dxc.CRUDdemo.controller.dto.request;

public class PersonDTO {
	private long id;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	private String name;
	private String mobile;
	private String dob;
	public PersonDTO() {
		
	}
	public PersonDTO(String name, String mobile, String dob) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.dob = dob;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}

}
