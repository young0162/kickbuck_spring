package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.MemberDao;
import com.spring.dto.MemberDto;

@Service
public class MemberService {

	@Autowired
	private MemberDao dao;
	
	public void insertMember(MemberDto dto)
	{
		dao.insertMember(dto);
	}
	
	public int loginCheck(String email1, String password)
	{
		return dao.loginCheck(email1, password);
	}
	
}