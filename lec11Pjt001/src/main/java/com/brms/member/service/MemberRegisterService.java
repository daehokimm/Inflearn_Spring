package com.brms.member.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.brms.member.Member;
import com.brms.member.dao.MemberDao;

public class MemberRegisterService {

	@Autowired
	private MemberDao memberDao;
	
	public void initMethod() {
		System.out.println("Create MemberRegisterService Bean Object!!");
	}
	public void destroyMethod() {
		System.out.println("Create MemberRegisterService Bean Object!!");
	}
	public MemberRegisterService() { }
	
	public void register(Member member) {
		memberDao.insert(member);
	}
}
