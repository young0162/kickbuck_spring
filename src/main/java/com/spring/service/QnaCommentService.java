package com.spring.service;

import java.util.List;

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
	
	// 코멘트 갯수 구하기
	public int getCommentCount(int num)
	{
		return dao.getCommentCount(num);
	}
	
	// 댓글 등록
	public void insertComment(QnaCommentDto dto)
	{
		dao.insertComment(dto);
	}
	
	// 댓글의 그룹 넘버 구해서 넣어주기
	public int getCommentGroupNum()
	{ 
		return dao.getCommentGroupNum();
	}
	
	public void updateCommentGroupNum(int gnum)
	{
		dao.updateCommentGroupNum(gnum);
	}
	
	
	
	// 대댓글 등록
	public void insertReplyComment(QnaCommentDto dto)
	{
		dao.insertReplyComment(dto);
	}
	
	// 댓글 삭제
	public void deleteComment(int comment_num)
	{
		dao.deleteComment(comment_num);
	}
	

}
