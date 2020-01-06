package com.spring.dao;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.spring.dto.FreeBoardCommentDto;

@Repository
public class FreeBoardCommentDao extends SqlSessionDaoSupport{
	
	public List<FreeBoardCommentDto> getAlldatas()
	{
		return getSqlSession().selectList("freeBoardCommentAllList");
	}
	
	

	
}
