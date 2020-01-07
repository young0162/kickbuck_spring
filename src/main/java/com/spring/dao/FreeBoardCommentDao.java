package com.spring.dao;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.spring.dto.FreeBoardCommentDto;

@Repository
public class FreeBoardCommentDao extends SqlSessionDaoSupport{
	
		// 코멘트 리스트
		public List<FreeBoardCommentDto> getAllDatas(int num)
		{
			return getSqlSession().selectList("FreeBoardCommentAllList", num);
		}
		
		// 코멘트 갯수 구하기
		public int getFreeCommentCount(int num)
		{
			return getSqlSession().selectOne("FreeBoardCommentCount", num);
		}
		
		// 댓글 등록
		public void insertComment(FreeBoardCommentDto dto)
		{
			getSqlSession().insert("FreeBoardCommentInsert", dto);
		}
		
		// 댓글의 그룹 넘버 구해서 넣어주기
		public int freeboardgetGroupNum()
		{ 
			return getSqlSession().selectOne("freeboardselectgroupnum");
		}
		
		public void freeboardupdateGroupNum(int gnum)
		{
			
			getSqlSession().update("freeboardupdategroupnum", gnum);
		}
		
		// 대댓글 등록
		public void freeboardcommentinsertReComment(FreeBoardCommentDto dto)
		{
			getSqlSession().insert("freeboardcommentrecommentinsert", dto);
		}
		
		// 댓글 삭제
		public void freeboardcommentdeleteComment(int comment_num)
		{
			getSqlSession().delete("freeboardcommentdelete", comment_num);
		}
	
}
