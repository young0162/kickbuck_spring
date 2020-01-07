package com.spring.dao;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.spring.dto.MypageDto;

@Repository
public class MypageDao extends SqlSessionDaoSupport{

	public List<MypageDto> getAllList(int start){
		return getSqlSession().selectList("mypageList",start);
	}
	
	public MypageDto getData(int num) {
		return getSqlSession().selectOne("mypageSelectData");
	}
}
