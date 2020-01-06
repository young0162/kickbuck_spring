package com.spring.dao;


import java.util.List;


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
	
	// 코멘트 갯수 구하기
	public int getCommentCount(int num)
	{
		return getSqlSession().selectOne("qnaCommentCount", num);
	}
	
	// 댓글 등록
	public void insertComment(QnaCommentDto dto)
	{
		getSqlSession().insert("qnaCommentInsert", dto);
	}
	
	// 댓글의 그룹 넘버 구해서 넣어주기
	public int getCommentGroupNum()
	{ 
		return getSqlSession().selectOne("selectGetGroupNum");
	}
	
	public void updateCommentGroupNum(int gnum)
	{
		
		getSqlSession().update("updateCommmentGroupNum", gnum);
	}
	
	// 대댓글 등록
	public void insertReplyComment(QnaCommentDto dto)
	{
		getSqlSession().insert("qnaReplyCommentInsert", dto);
	}
	
	// 댓글 삭제
	public void deleteComment(int comment_num)
	{
		getSqlSession().delete("qnaCommentDelete", comment_num);
	}

}
