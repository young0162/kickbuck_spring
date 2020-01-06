package com.spring.dao;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.spring.dto.QnADto;

@Repository
public class QnADao extends SqlSessionDaoSupport{
	
	// 리스트 출력 메서드
	public List<QnADto> getAllDatas(int start)
	{
		return getSqlSession().selectList("qnaAllList", start);
	}
	
	// 게시판 입력 메서드
	public void insertData(QnADto dto)
	{
		getSqlSession().insert("qnaBoardInsert",dto);
	}
	
	// 삭제 메서드
	public void deleteData(int num)
	{
		getSqlSession().delete("qnaBoardDelete", num);
	}
	
	// 리드카운트 메서드
	public void updateReadCount(int num)
	{
		getSqlSession().update("qnaBoardUpdateReadCount", num);
	}
	
	// 선택한 게시물 데이터 받는 메서드
	public QnADto getData(int num)
	{
		return getSqlSession().selectOne("qnaBoardSelectOne", num);
	}
	
	// 게시판 글 수정 메서드
	public void updateData(QnADto dto)
	{
		getSqlSession().update("qnaBoardUpdate", dto);
	}
}
