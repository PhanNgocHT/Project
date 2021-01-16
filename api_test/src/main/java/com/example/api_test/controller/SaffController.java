package com.example.api_test.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.api_test.model.SaffModel;
import com.example.api_test.service.SaffService;

@RestController
@RequestMapping("api")
public class SaffController {
	@Autowired
	private SaffService saffService;
	
	@GetMapping(value = "getAll")
	public List<SaffModel> getAll(){
		return saffService.getAll();
	}
}
