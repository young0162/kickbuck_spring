package com.spring.dao;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.spring.dto.WithBoardDto;

@Repository
public class WithBoardDao extends SqlSessionDaoSupport{
	
	public List<WithBoardDto> getAllDatas()
	{
		return getSqlSession().selectList("withBoardList");
	}
	
	// 댓글 등록
	public void insertComment(WithBoardDto dto)
	{
		getSqlSession().insert("withBoardInsert", dto);
	}
	
	// 댓글의 그룹 넘버 구해서 넣어주기
	public int getCommentGroupNum()
	{ 
		return getSqlSession().selectOne("selectGetWithGroupNum");
	}
	
	public void updateCommentGroupNum(int gnum)
	{		
		getSqlSession().update("updateWithGroupNum", gnum);
	}

}
