package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.ProfileDao;
import com.spring.dto.ProfileDto;


@Service
public class ProfileService {

	@Autowired
	private ProfileDao dao;
	
	public void insertProfile(ProfileDto dto)
	{
		dao.insertProfile(dto);
	}
	
	public ProfileDto getData(int num) {
		return dao.getData(num);
	}
	
	//수정
	public void updateProfile(ProfileDto dto) 
	{
		dao.updateProfile(dto); 
	}
	
	public ProfileDto getImage(int num) {
		return dao.getImage(num);
	}
}





