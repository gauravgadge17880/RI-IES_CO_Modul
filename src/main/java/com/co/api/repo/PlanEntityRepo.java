package com.co.api.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.co.api.entity.PlanEntity;

public interface PlanEntityRepo extends JpaRepository<PlanEntity, Integer>{
	public PlanEntity findByCaseNum(Integer caseNum);

}
