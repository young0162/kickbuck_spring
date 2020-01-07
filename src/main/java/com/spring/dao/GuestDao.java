package com.spring.dao;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.spring.dto.GuestDto;

@Repository
public class GuestDao extends SqlSessionDaoSupport {
	
	public List<GuestDto> getGuestList() {
		return getSqlSession().selectList("getGuestList");
	}

	public void insertGuest(GuestDto dto) {
		getSqlSession().insert("GuestInsert", dto);
	}
}