package com.spring.dao;

import java.util.HashMap;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.spring.dto.MemberDto;

@Repository
public class MemberDao extends SqlSessionDaoSupport {
	
	public void insertMember(MemberDto dto)
	{
		getSqlSession().insert("memberInsert",dto);
	}
	
	public int loginCheck(String email1, String password)
	{
		Map<String, String> map = new HashMap<String, String>();
		map.put("email1",email1);
		map.put("password",password);
		
		return getSqlSession().selectOne("loginCheck",map);
	}
	
}
