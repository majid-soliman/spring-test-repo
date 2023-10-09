package com.test.springStudying.config;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.test.springStudying.service.Names;
import com.test.springStudying.service.ProtoBean;

import ExternalPackage.ExNames;

@Configuration

public class BeanConfig {

//	@Bean
//	public Names namesBean() {
//	 return new Names();
//	}
	
//@Bean
//public ExNames getExNAmes() {
//	return new ExNames();
//}
	
	
	
//	@Bean
//	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//	public ProtoBean pBean() {
//		 return new ProtoBean();
//	}
}
