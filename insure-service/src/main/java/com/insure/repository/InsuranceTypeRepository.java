package com.insure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.insure.entity.InsuranceType;

@Repository
public interface InsuranceTypeRepository extends JpaRepository<InsuranceType, Integer> {

}
