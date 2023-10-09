package com.test.springStudying.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.springStudying.service.Names;

import ExternalPackage.ExNames;

@RestController
@RequestMapping("/names")
public class NamesController {

	@Autowired
	ExNames names;
	
	@GetMapping("/getNames")
	public String getNames() {
		
		
		return names.displayNames();
	}
}
