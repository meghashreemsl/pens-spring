package com.wolken.wolkenapp;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wolken.wolkenapp.bean.PensBean;
import com.wolken.wolkenapp.bean.RifilBean;

public class PensUtil {
	
	public static void main(String[] args) {
	Logger logger=Logger.getLogger("PensUtil");
	logger.info("*********************main method******************");
	ApplicationContext applicationContext= new ClassPathXmlApplicationContext("context.spring.xml");
	PensBean bean= applicationContext.getBean(PensBean.class);
	//System.out.println(bean);
	//System.out.println(bean.getName()+" "+bean.getCompanyName());
	
	logger.info(bean);
	logger.info(bean.getCompanyName()+" "+bean.getName());
	RifilBean bean1 = applicationContext.getBean(RifilBean.class);
	//System.out.println(bean1);
	//System.out.println(bean1.getRifilName()+" "+bean1.getRifilColor());
	logger.info(bean1);
	logger.info(bean1.getRifilName()+" "+bean1.getRifilColor());
	
	}

}
