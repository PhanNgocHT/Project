package com.example.api_test.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.api_test.entity.Department;
import com.example.api_test.entity.ProjectTeam;
import com.example.api_test.entity.Saff;
import com.example.api_test.model.DepartmentModel;
import com.example.api_test.model.ProjectTeamModel;
import com.example.api_test.model.SaffModel;
import com.example.api_test.repository.DepartmentRespository;
import com.example.api_test.repository.ProjectTeamRespository;
import com.example.api_test.repository.SaffRespository;

@Service
public class SaffService {
	@Autowired
	private DepartmentRespository departmentRespository;
	
	@Autowired
	private SaffRespository saffRespository;
	
	@Autowired
	private ProjectTeamRespository projectTeamRespository;
	
	public List<SaffModel> getAll() {
		List<SaffModel> saffModelList = new ArrayList<SaffModel>();
		List<Saff> saffList = saffRespository.findAll();
		if (saffList.isEmpty()) {
			return saffModelList;
		}
		saffModelList.addAll(saffList.stream()
				.map(x -> new SaffModel(x.getSaffCode(), x.getSaffName(), x.getPosition(), x.getPhoneNumber(),getProjectTeamWithSaffCode(x.getSaffCode()) , x.getEmail())).collect(Collectors.toList()));
		return saffModelList;
	}
	
	private List<ProjectTeamModel> getProjectTeamWithSaffCode(Integer saffCode) {
		List<ProjectTeamModel> projectTeamModelList = new ArrayList<ProjectTeamModel>();
		List<Integer> saffCodes = new ArrayList<Integer>();
		saffCodes.add(saffCode);
		List<ProjectTeam> projectTeamList = projectTeamRespository.findAllById(saffCodes);
		if (projectTeamList.isEmpty()) {
			return projectTeamModelList;
		}
		projectTeamModelList.addAll(projectTeamList.stream()
				.map(x -> new ProjectTeamModel(x.getProjectTeamCode(), x.getProjectTeamName(), getDepartmentWithDepartmentCode(x.getDepartment().getDepartmentCode())))
				.collect(Collectors.toList()));
		return projectTeamModelList;
	}
	
	private DepartmentModel getDepartmentWithDepartmentCode(Integer departmentCode) {
		Department department = departmentRespository.getOne(departmentCode);
		return department == null ? null : new DepartmentModel(department.getDepartmentCode(), 
				department.getManageCode(), department.getDepartmentName(), department.getPeopleNumber(), department.getProjectNumber());
	}
}
