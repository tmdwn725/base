package com.spring.club.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.club.domain.Member;

public interface MemberRepository extends JpaRepository<Member, Long>{

}
