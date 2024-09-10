package com.co.api.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.co.api.entity.CitizenAppEntity;

public interface CitizenAppRepo extends JpaRepository<CitizenAppEntity, Integer> {

}
