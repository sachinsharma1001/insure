package com.insure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.insure.entity.UserInsuranceInfo;
import com.insure.repository.custom.UserInsuranceInfoRepositoryCustom;

@Repository
public interface UserInsuranceInfoRepository extends JpaRepository<UserInsuranceInfo, Integer>, UserInsuranceInfoRepositoryCustom {

}
