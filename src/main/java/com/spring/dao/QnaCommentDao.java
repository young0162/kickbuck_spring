package com.spring.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.spring.dto.QnaCommentDto;

@Repository
public class QnaCommentDao extends SqlSessionDaoSupport{
	
	// 코멘트 리스트
	public List<QnaCommentDto> getAllDatas(int num)
	{
		return getSqlSession().selectList("qnaCommentAllList", num);
	}
	
	// 댓글 등록
	public void insertComment(QnaCommentDto dto)
	{
		getSqlSession().insert("qnaCommentInsert", dto);
	}
	
	// 댓글의 그룹 넘버 구해서 넣어주기
	public int getGroupNum()
	{ 
		return getSqlSession().selectOne("selectGroupNum");
	}
	
	public void updateGroupNum(int gnum)
	{
		
		getSqlSession().update("updateGroupNum", gnum);
	}
	
	// 대댓글 등록
	public void insertReComment(QnaCommentDto dto)
	{
		getSqlSession().insert("qnaReCommentInsert", dto);
	}
	
	

}
