package com.insure.repository.custom;

import java.util.List;

import com.insure.dto.InsureDashBoardDto;

public interface UserInsuranceInfoRepositoryCustom {

	public List<InsureDashBoardDto> getUserInsuranceInfoList(Integer userId);
}
