package com.spring.club.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.spring.club.dto.MemberDTO;
import com.spring.club.service.MainService;

@Controller
public class MainController {
	
private MainService mainService;
	
	@Autowired
	public MainController(MainService mainService) {
		this.mainService = mainService;
	}

	@GetMapping("/")
	public String main(Model model) {
		
		List<MemberDTO> memberList = mainService.findMembers();
		model.addAttribute("members",memberList);
		System.out.println(memberList.size());
		return "Main";
	}
}
