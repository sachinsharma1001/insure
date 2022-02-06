package com.insure.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InsureDashBoardDto {

	@JsonProperty("insurance_type_name")
	private String insuranceTypeName;

	@JsonProperty("policy_number")
	private String policyNumber;

	@JsonProperty("end_date")
	private long endDate;

	@JsonProperty("company_name")
	private String companyName;

	public InsureDashBoardDto(String insuranceTypeName, String policyNumber, Date endDate, String companyName) {
		super();
		this.insuranceTypeName = insuranceTypeName;
		this.policyNumber = policyNumber;
		this.endDate = endDate.getTime();
		this.companyName = companyName;
	}

	public String getInsuranceTypeName() {
		return insuranceTypeName;
	}

	public void setInsuranceTypeName(String insuranceTypeName) {
		this.insuranceTypeName = insuranceTypeName;
	}

	public String getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}

	public long getEndDate() {
		return endDate;
	}

	public void setEndDate(long endDate) {
		this.endDate = endDate;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

}
