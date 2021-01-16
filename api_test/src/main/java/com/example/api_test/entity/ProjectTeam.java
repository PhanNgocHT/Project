package com.example.api_test.entity;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "projectteam")
public class ProjectTeam implements Serializable{

	@Id
	@Column(name = "ProjectTeamCode", nullable = false)
	private int projectTeamCode;
	
	@Column(name = "ProjectTeamName", nullable = false)
	private String projectTeamName;
	
	@ManyToOne 
    @JoinColumn(name = "DepartmentCode", nullable = true)
	private Department department;
	
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(name = "projectpk",
	            joinColumns = @JoinColumn(name = "ProjectTeamCode"),
	            inverseJoinColumns = @JoinColumn(name = "SaffCode") 
	)
	private Collection<Saff> saffList;

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

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Collection<Saff> getSaffList() {
		return saffList;
	}

	public void setSaffList(Collection<Saff> saffList) {
		this.saffList = saffList;
	}
	
}
