package com.spring.club.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.club.service.MainService;


public class MainController {
	
private MainService mainService;
	
	@Autowired
	public MainController(MainService mainService) {
		this.mainService = mainService;
	}

}
