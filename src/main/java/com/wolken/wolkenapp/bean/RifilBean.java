package com.wolken.wolkenapp.bean;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;

@Getter
@Setter

@Component
public class RifilBean {
	@Value("cello")
	private String rifilName;
	@Value("blue")
	private String rifilColor;
	
	

}
