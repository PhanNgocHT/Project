package com.example.api_test.model;

public class ProjectTeamModel {
	private int projectTeamCode;
	
	private String projectTeamName;
	
	private DepartmentModel department;
	
	public ProjectTeamModel() {
		super();
	}
	
	public ProjectTeamModel(int projectTeamCode, String projectTeamName, DepartmentModel department) {
		super();
		this.projectTeamCode = projectTeamCode;
		this.projectTeamName = projectTeamName;
		this.department = department;
	}

	public int getProjectTeamCode() {
		return projectTeamCode;
	}

	public void setProjectTeamCode(int projectTeamCode) {
		this.projectTeamCode = projectTeamCode;
	}

	public String getProjectTeamName() {
		return projectTeamName;
	}

	public void setProjectTeamName(String projectTeamName) {
		this.projectTeamName = projectTeamName;
	}

	public DepartmentModel getDepartment() {
		return department;
	}

	public void setDepartment(DepartmentModel department) {
		this.department = department;
	}

}
