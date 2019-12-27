package com.spring.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.QnaCommentDao;
import com.spring.dto.QnaCommentDto;

@Service
public class QnaCommentService {
	
	@Autowired
	private QnaCommentDao dao;
	
	
	// 코멘트 리스트
	public List<QnaCommentDto> getAllDatas(int num)
	{
		return dao.getAllDatas(num);
	}
	
	// 댓글 등록
	public void insertComment(QnaCommentDto dto)
	{
		dao.insertComment(dto);
	}
	
	// 댓글의 그룹 넘버 구해서 넣어주기
	public int getGroupNum()
	{ 
		return dao.getGroupNum();
	}
	
	public void updateGroupNum(int gnum)
	{
		dao.updateGroupNum(gnum);
	}
	
	
	
	// 대댓글 등록
	public void insertReComment(QnaCommentDto dto)
	{
		dao.insertReComment(dto);
	}
	
	// 댓글 삭제
		public void deleteComment(int comment_num)
		{
			dao.deleteComment(comment_num);
		}
	

}
