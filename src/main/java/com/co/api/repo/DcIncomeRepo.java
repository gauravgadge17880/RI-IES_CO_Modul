package com.co.api.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.co.api.entity.DcIncomeEntity;

public interface DcIncomeRepo extends JpaRepository<DcIncomeEntity, Integer> {
	public DcIncomeEntity findByCaseNum(Integer caseNum);

}
