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
	
	public int loginCheck(String user_name, String password)
	{
		return dao.loginCheck(user_name, password);
	}
	
	public int emailCheck(String email)
	{
		return dao.emailCheck(email);
	}
	
	public int UserNameCheck(String user_name)
	{
		return dao.UserNameCheck(user_name);
	}
	
	public MemberDto getData(int num) {
		return dao.getData(num);
	}
	
	//수정
	public void updateProfile(MemberDto dto) 
	{
		dao.updateProfile(dto); 
	}
	
	public MemberDto getImage(int num) {
		return dao.getImage(num);
	}
}
