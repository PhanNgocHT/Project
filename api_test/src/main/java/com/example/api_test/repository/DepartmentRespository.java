package com.example.api_test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.api_test.entity.Department;

@Repository
public interface DepartmentRespository extends JpaRepository<Department, Integer>{

}
