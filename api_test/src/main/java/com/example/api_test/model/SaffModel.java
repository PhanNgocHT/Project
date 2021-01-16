package com.example.api_test.model;

import java.util.Collection;

public class SaffModel {
	private int saffCode;
	
	private String saffName;
	
	private String position;
	
	private String phoneNumber;
	
	private Collection<ProjectTeamModel> projectTeamList;
	
	private String email;

	public SaffModel() {
		super();
	}

	public SaffModel(int saffCode, String saffName, String position, String phoneNumber,
			Collection<ProjectTeamModel> projectTeamList, String email) {
		super();
		this.saffCode = saffCode;
		this.saffName = saffName;
		this.position = position;
		this.phoneNumber = phoneNumber;
		this.projectTeamList = projectTeamList;
		this.email = email;
	}

	public int getSaffCode() {
		return saffCode;
	}

	public void setSaffCode(int saffCode) {
		this.saffCode = saffCode;
	}

	public String getSaffName() {
		return saffName;
	}

	public void setSaffName(String saffName) {
		this.saffName = saffName;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Collection<ProjectTeamModel> getProjectTeamList() {
		return projectTeamList;
	}

	public void setProjectTeamList(Collection<ProjectTeamModel> projectTeamList) {
		this.projectTeamList = projectTeamList;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
