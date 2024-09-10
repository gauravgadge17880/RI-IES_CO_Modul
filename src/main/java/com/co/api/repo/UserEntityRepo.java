package com.co.api.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.co.api.entity.UserEntity;

public interface UserEntityRepo extends JpaRepository<UserEntity , Integer> {
	public UserEntity findByCaseNum(Integer caseNum);

}
