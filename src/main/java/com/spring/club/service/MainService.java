package com.spring.club.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.club.repository.MemberRepository;

@Service
public class MainService {
	
	private MemberRepository memberRepository;
	
	@Autowired
	public MainService(MemberRepository memberRepository) {
		this.memberRepository = memberRepository;
	}
	
}
