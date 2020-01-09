package com.spring.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.spring.dto.BucketDto;
import com.spring.dto.QnaCommentDto;

@Repository
public class BucketCommentDao extends SqlSessionDaoSupport{
	
	//bucket comment
	// 코멘트 리스트
	public List<QnaCommentDto> getAllDatas(int num)
	{
		return getSqlSession().selectList("bucketCommentAllList", num);
	}
	
	// 코멘트 갯수 구하기
	public int getCommentCount(int num)
	{
		return getSqlSession().selectOne("bucketCommentCount", num);
	}
	
	// 댓글 등록
	public void insertComment(QnaCommentDto dto)
	{
		getSqlSession().insert("bucketCommentInsert", dto);
	}
	
	// 댓글의 그룹 넘버 구해서 넣어주기
	public int getCommentGroupNum()
	{ 
		return getSqlSession().selectOne("bselectGetGroupNum");
	}
	
	public void updateCommentGroupNum(int gnum)
	{
		
		getSqlSession().update("bupdateCommmentGroupNum", gnum);
	}
	
	// 대댓글 등록
	public void insertReplyComment(QnaCommentDto dto)
	{
		getSqlSession().insert("bucketReplyCommentInsert", dto);
	}
	
	// 댓글 삭제
	public void deleteComment(int comment_num)
	{
		getSqlSession().delete("bucketCommentDelete", comment_num);
	}
}



















