package com.example.api_test.model;

public class DepartmentModel {
	private int departmentCode;
	
	private int manageCode;
	
	private String departmentName;
	
	private int peopleNumber;
	
	private int projectNumber;

	public DepartmentModel() {
		super();
	}

	public DepartmentModel(int departmentCode, int manageCode, String departmentName, int peopleNumber,
			int projectNumber) {
		super();
		this.departmentCode = departmentCode;
		this.manageCode = manageCode;
		this.departmentName = departmentName;
		this.peopleNumber = peopleNumber;
		this.projectNumber = projectNumber;
	}



	public int getDepartmentCode() {
		return departmentCode;
	}

	public void setDepartmentCode(int departmentCode) {
		this.departmentCode = departmentCode;
	}

	public int getManageCode() {
		return manageCode;
	}

	public void setManageCode(int manageCode) {
		this.manageCode = manageCode;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public int getPeopleNumber() {
		return peopleNumber;
	}

	public void setPeopleNumber(int peopleNumber) {
		this.peopleNumber = peopleNumber;
	}

	public int getProjectNumber() {
		return projectNumber;
	}

	public void setProjectNumber(int projectNumber) {
		this.projectNumber = projectNumber;
	}
	
}
