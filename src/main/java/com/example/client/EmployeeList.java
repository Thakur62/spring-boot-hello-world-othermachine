package com.example.client;

import java.util.Date;

public class EmployeeList {

	private Long id;
	
	private String name;
	
	private String designation;
	
	private String expertise;
	
	private Date createdAt;

	
	
	public EmployeeList(Long id, String name, String designation, String expertise, Date createdAt) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.expertise = expertise;
		this.createdAt = createdAt;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getExpertise() {
		return expertise;
	}

	public void setExpertise(String expertise) {
		this.expertise = expertise;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	
	
	
}
