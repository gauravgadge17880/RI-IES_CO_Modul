package com.co.api.binding;

import java.time.LocalDate;

import org.springframework.cglib.core.Local;

import lombok.Data;

@Data
public class CoInfo {
	
	private String planName;
	
	private String planStatus;
	
	private LocalDate planStartDate;
	
	private LocalDate planEndDate;
	
	private Double benefitAmt;
	
	private String denialRsn;
	
	private LocalDate genDate;
	

}
