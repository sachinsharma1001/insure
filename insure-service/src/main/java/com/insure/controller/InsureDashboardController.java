package com.insure.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.insure.dto.GenericResponseBean;
import com.insure.dto.InsureDashBoardDto;
import com.insure.service.InsureDashboardService;

@RestController
@RequestMapping("/api")
public class InsureDashboardController {

	@Autowired
	private InsureDashboardService insureDashboardService;
	
	@GetMapping("/user/{user_id}")
	public GenericResponseBean<InsureDashBoardDto> getUserInsuranceInfo(@PathVariable("user_id") Integer userId) {
		return null;
	}
}
