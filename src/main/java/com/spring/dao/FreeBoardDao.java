package com.spring.dao;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.spring.dto.FreeBoardDto;

@Repository
public class FreeBoardDao extends SqlSessionDaoSupport{
	
	public List<FreeBoardDto> getAllDatas()
	{
		return getSqlSession().selectList("boardAllList");
	}
	
	public FreeBoardDto getData(int num)
	{
		return getSqlSession().selectOne("boardSelectOne",num);
	}
	
	public void updateReadCnt(int num)
	{
		getSqlSession().update("boardUpdateReadcnt",num);
	}
	
	public void insertFreeBoard(FreeBoardDto dto)
	{
		getSqlSession().insert("boardInsert", dto);
	}
	
	public void DeleteFreeBoard(int num)
	{
		getSqlSession().delete("boardDelete", num);
	}
	
	public void  updateFreeBoard(FreeBoardDto dto)
	{
		getSqlSession().update("boardUpdate", dto);
	}

}
