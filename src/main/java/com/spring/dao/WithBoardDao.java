package com.spring.dao;


import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;


import com.spring.dto.WithBoardDto;


@Repository
public class WithBoardDao extends SqlSessionDaoSupport{
	
	public List<WithBoardDto> getAllDatas(int num)
	{
		return getSqlSession().selectList("withBoardList",num);
	}
	
	// 댓글 등록
	public void insertComment(WithBoardDto dto)
	{
		getSqlSession().insert("withBoardInsert", dto);
	}
	
	// 댓글의 그룹 넘버 구해서 넣어주기
	public int getCommentGroupNum()
	{ 
		return getSqlSession().selectOne("selectGetWithGroupNum");
	}
	
	public void updateCommentGroupNum(int gnum)
	{		
		getSqlSession().update("updateWithGroupNum", gnum);
	}
	
	// 댓글 등록
	public void insertWithReplyComment(WithBoardDto dto)
	{
		getSqlSession().insert("withReplyCommentInsert", dto);
	}
	
	// 댓글 삭제
	public void deleteWithComment(int with_num)
	{
		getSqlSession().delete("withCommentDelete", with_num);
	}
	
	// 이미지 네임을 배열로 불러오기
	public List<String> getImageNames(int num)
	{
		return getSqlSession().selectList("withImageGalleryData",num);
	}

}
