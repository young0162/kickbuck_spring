package com.spring.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.spring.dto.BucketDto;

@Repository
public class BucketDao extends SqlSessionDaoSupport{
	
	public void insertBucket(BucketDto dto)
	{
		getSqlSession().insert("bucketInsert",dto);
	}
	
	public void bucketWithUp(String user_name, String num)
	{
		Map<String, String> map = new HashMap<String, String>();
		map.put("user_name",user_name);
		map.put("num",num);
		
		getSqlSession().update("bucketWithUp",map);
	}
	
	public void bucketLikeUp(String user_name, String num)
	{
		Map<String, String> map = new HashMap<String, String>();
		map.put("user_name",user_name);
		map.put("num",num);
		getSqlSession().update("bucketLikeUp",map);
	}
	
	public List<BucketDto> AllSelect()
	{
		return getSqlSession().selectList("AllSelect");
	}
	
	public BucketDto OneSelect(int num) 
	{
		return getSqlSession().selectOne("OneSelect",num);
	}
	
	public List<BucketDto> SearchSelect(String keyword)
	{
		return getSqlSession().selectList("SearchSelect",keyword);
	}
	
}
