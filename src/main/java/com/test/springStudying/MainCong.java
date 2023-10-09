package com.test.springStudying;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.test.springStudying.config.BeanConfig;
import com.test.springStudying.service.Names;

import ExternalPackage.ExNames;

public class MainCong {

	//Majid Soliman Test
	public static void main(String args[]) {
		
	AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(BeanConfig.class);
	
	Names names = app.getBean(Names.class);
	
	
	names.getName();
	
	
	}
	
}
