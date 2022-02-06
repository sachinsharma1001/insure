package com.insure.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insure.dto.GenericResponseBean;
import com.insure.dto.InsureDashBoardDto;
import com.insure.repository.UserInsuranceInfoRepository;
import com.insure.service.InsureDashboardService;

@Service
public class InsureDashboardServiceImpl implements InsureDashboardService {

	@Autowired
	private UserInsuranceInfoRepository userInsuranceInfoRepository;

	@Override
	public GenericResponseBean<InsureDashBoardDto> getUserInsuranceInfo(Integer userId) {
		GenericResponseBean<InsureDashBoardDto> genericResponse = new GenericResponseBean<>();
		Map<String, List<InsureDashBoardDto>> resultMap = new HashMap<>();

		List<InsureDashBoardDto> userInsuranceInfoList = userInsuranceInfoRepository.getUserInsuranceInfoList(userId);
		resultMap.put("data", userInsuranceInfoList);

		genericResponse.setData(resultMap);
		genericResponse.setStatus(true);
		return genericResponse;
	}

}
