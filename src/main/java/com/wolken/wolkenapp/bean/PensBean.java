package com.wolken.wolkenapp.bean;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

@Getter 
@Setter
@Component
public class PensBean {
	
	@Value("cello")
	private String name;
	@Value("cello")
	private String companyName;
	@Autowired
	private RifilBean rifilBean;
	

}
