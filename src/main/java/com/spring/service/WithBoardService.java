package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.WithBoardDao;
import com.spring.dto.WithBoardDto;

@Service
public class WithBoardService {
	
	@Autowired
	private WithBoardDao dao;
	
	public List<WithBoardDto> getAllDatas(int num)
	{
		return dao.getAllDatas(num);
	}
		
	// 댓글 등록
	public void insertComment(WithBoardDto dto)
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
	public void insertWithReplyComment(WithBoardDto dto)
	{
		dao.insertWithReplyComment(dto);
	}
	
	// 댓글 삭제
	public void deleteWithComment(int with_num)
	{
		dao.deleteWithComment(with_num);
	}
	
	// 이미지 네임을 배열로 불러오기
	public List<String> getImageNames(int num)
	{
		return dao.getImageNames(num);
	}
}
