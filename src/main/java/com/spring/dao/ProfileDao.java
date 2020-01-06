package com.spring.dao;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.spring.dto.ProfileDto;

@Repository
public class ProfileDao extends SqlSessionDaoSupport {

	public void insertProfile(ProfileDto dto)
	{
		getSqlSession().insert("profileInsert", dto);
	}
	
	public ProfileDto getData(int num) {
		return getSqlSession().selectOne("profileSelect",num);
	}
	
	//수정
	public void updateProfile(ProfileDto dto) 
	{
		getSqlSession().update("profileUpdate", dto); 
	}
	
	public ProfileDto getImage(int num) {
		return getSqlSession().selectOne("profileImage",num);
	}
}




