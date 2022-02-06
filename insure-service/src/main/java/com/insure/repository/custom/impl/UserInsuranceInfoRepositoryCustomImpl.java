package com.insure.repository.custom.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.insure.dto.InsureDashBoardDto;
import com.insure.entity.InsuranceCompany;
import com.insure.entity.InsuranceType;
import com.insure.entity.User;
import com.insure.entity.UserInsuranceInfo;
import com.insure.repository.custom.UserInsuranceInfoRepositoryCustom;

public class UserInsuranceInfoRepositoryCustomImpl implements UserInsuranceInfoRepositoryCustom {
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private EntityManager entityManager;

	@Override
	public List<InsureDashBoardDto> getUserInsuranceInfoList(Integer userId) {
		List<InsureDashBoardDto> userInsuranceInfoList = new ArrayList<>(); 
		try {
			CriteriaBuilder cb = entityManager.getCriteriaBuilder();
			CriteriaQuery<InsureDashBoardDto> query = cb.createQuery(InsureDashBoardDto.class);
			Root<UserInsuranceInfo> root = query.from(UserInsuranceInfo.class);
			Join<UserInsuranceInfo, User> userJoin = root.join("user", JoinType.INNER);
			Join<UserInsuranceInfo, InsuranceType> insuranceTypeJoin = root.join("insuranceType", JoinType.INNER);
			Join<UserInsuranceInfo, InsuranceCompany> companyJoin = root.join("insuranceCompany", JoinType.INNER);
			
			List<Predicate> predicateList = new ArrayList<>();
			predicateList.add(cb.equal(userJoin.get("id"), userId));
			
			
		  query.select(cb.construct(InsureDashBoardDto.class, insuranceTypeJoin.get("insuranceType"), root.get("policyNumber"), root.get("endDate"),  companyJoin.get("companyName")))
		  .where(predicateList.toArray(new Predicate[predicateList.size()]));
			
		  userInsuranceInfoList = entityManager.createQuery(query).getResultList();
		} catch(Exception ex) {
			logger.error("Error in getting user insurance info list: {}", ex.getMessage());
		}
		return userInsuranceInfoList;
	}

}
