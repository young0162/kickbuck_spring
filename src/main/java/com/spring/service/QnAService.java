package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.QnADao;
import com.spring.dto.QnADto;

@Service
public class QnAService {
	
	@Autowired
	private QnADao dao;
	
	public List<QnADto> getAllDatas(int start)
	{
		return dao.getAllDatas(start);
	}
	
	// 게시판 입력 메서드
	public void insertData(QnADto dto)
	{
		dao.insertData(dto);
	}
	
	// 삭제 메서드
	public void deleteData(int num)
	{
		dao.deleteData(num);
	}
	
	// 리드 카운트 메서드
	public void updateReadCount(int num)
	{
		dao.updateReadCount(num);
	}
	
	// 선택한 게시물 데이터 받는 메서드
	public QnADto getData(int num)
	{
		return dao.getData(num);
	}
	
	// 게시판 글 수정 메서드
	public void updateData(QnADto dto)
	{
		dao.updateData(dto);		
	}

}
