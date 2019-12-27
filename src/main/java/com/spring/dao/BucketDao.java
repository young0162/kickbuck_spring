package com.spring.dao;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.spring.dto.BucketDto;

@Repository
public class BucketDao extends SqlSessionDaoSupport{
	
	public void insertBucket(BucketDto dto)
	{
		getSqlSession().insert("bucketInsert",dto);
	}
	
	public void bucketWithUp(int num)
	{
		getSqlSession().update("bucketWithUp",num);
	}
	
	public void bucketLikeUp(int num)
	{
		getSqlSession().update("bucketLikeUp",num);
	}
	
	public List<BucketDto> AllSelect()
	{
		return getSqlSession().selectList("AllSelect");
	}
	
}
