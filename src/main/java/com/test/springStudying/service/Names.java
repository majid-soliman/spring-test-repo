package com.test.springStudying.service;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

import ExternalPackage.ExNames;

//@Component("namesBean")


public class Names {

	
	public String getName() {
		
		ProtoBean bean  = getProto();
		System.out.println("Names is :Majid Soliman At: "+bean.getTime());
		ExNames ex = getExnames();
	//	ex.names();
		
		return "Names Success";
		
	}
	
	public ExNames getExnames() {
		return new ExNames();
	}

	public ProtoBean getProto() {
		return new ProtoBean();
	}
	
}
