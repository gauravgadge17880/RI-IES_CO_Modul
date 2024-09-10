package com.co.api.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.co.api.entity.DcEducationEntity;

public interface DcEducationRepo extends JpaRepository<DcEducationEntity, Integer> {
	public DcEducationEntity findByCaseNum(Integer caseNum);

}
