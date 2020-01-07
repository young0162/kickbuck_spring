package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.FreeBoardCommentDao;
import com.spring.dto.FreeBoardCommentDto;

@Service
public class FreeBoardCommentService {
	@Autowired
	private FreeBoardCommentDao dao;
	
	// 코멘트 리스트
		public List<FreeBoardCommentDto> getAllDatas(int num)
		{
			return dao.getAllDatas(num);
		}
		
		// 코멘트 갯수 구하기
		public int getFreeCommentCount(int num)
		{
			return dao.getFreeCommentCount(num);
		}
		
		// 댓글 등록
		public void insertComment(FreeBoardCommentDto dto)
		{
			dao.insertComment(dto);
		}
		
		// 댓글의 그룹 넘버 구해서 넣어주기
		public int freeboardgetGroupNum()
		{ 
			return dao.freeboardgetGroupNum();
					
		}
		
		public void freeboardupdateGroupNum(int gnum)
		{
			
			dao.freeboardupdateGroupNum(gnum);
		}
		
		// 대댓글 등록
		public void freeboardcommentinsertReComment(FreeBoardCommentDto dto)
		{
			dao.freeboardcommentinsertReComment(dto);
		}
		
		// 댓글 삭제
		public void freeboardcommentdeleteComment(int comment_num)
		{
			dao.freeboardcommentdeleteComment(comment_num);
		}
}
