package com.insure.service;

import org.springframework.stereotype.Service;

import com.insure.dto.GenericResponseBean;
import com.insure.dto.InsureDashBoardDto;

@Service
public interface InsureDashboardService {

	public GenericResponseBean<InsureDashBoardDto> getUserInsuranceInfo(Integer userId);
}
