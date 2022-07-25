package com.spring.club.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.club.common.EntityConvert;
import com.spring.club.dto.MemberDTO;
import com.spring.club.repository.MemberRepository;

@Service
public class MainService {
	
	private MemberRepository memberRepository;
	
	@Autowired
	public MainService(MemberRepository memberRepository) {
		this.memberRepository = memberRepository;
	}
	
	public List<MemberDTO> findMembers(){
		return EntityConvert.convertList(memberRepository.findAll());
	}
}
