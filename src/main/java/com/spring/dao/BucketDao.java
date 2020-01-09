package com.spring.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.spring.dto.BucketDto;
import com.spring.dto.QnaCommentDto;

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
	
	public void OffUpdate(int num)
	{
		getSqlSession().update("OffUpdate",num);
	}
	
	public List<BucketDto> OffSelect()
	{
		return getSqlSession().selectList("OffSelect");
	}
	
	public BucketDto OffOneSelect(int num)
	{
		return getSqlSession().selectOne("OffOneSelect",num);
	}
	
	public List<BucketDto> SoloSelect()
	{
		return getSqlSession().selectList("SoloSelect");
	}
	
	public List<BucketDto> WithSelect()
	{
		return getSqlSession().selectList("WithSelect");
	}
	

	public BucketDto BucketWithCheck(int num) 
	{
		return getSqlSession().selectOne("BucketWithCheck",num);
	}

	

	
	// 마이페이지 나의 버킷 관련  
	public List<BucketDto> getMyList(String user_name)
	{
		return getSqlSession().selectList("mypageMyBucketList",user_name);
	}
	public void MyBucketDelte(int num)
	{
		getSqlSession().delete("MyBucketDelte",num);
	}
	
	public List<BucketDto> MyOffBucketList(String user_name)
	{
		return getSqlSession().selectList("MyOffBucketList",user_name);
	}
	
	
	// 대기중인 나의 버킷 리스트 
	public List<BucketDto> WaitMyBucket(String user_name)
	{
		return getSqlSession().selectList("WaitMyBucket",user_name);
	}
	
	public List<BucketDto> getOurList(String user_name)
	{
		return getSqlSession().selectList("mypageOurBucketList",user_name);
	}
	
	public List<BucketDto> MyLikeUpBucket(String user_name)
	{
		return getSqlSession().selectList("MyLikeUpBucket",user_name);
	}
	
	public void WaitComplete(String num)
	{
		getSqlSession().update("WaitComplete",num);
	}

	
	public String withuserselect(int num)
	{
		return getSqlSession().selectOne("withuserselect",num);
	}
	
	public int WithCountCheck(int num)
	{
		return getSqlSession().selectOne("WithCountCheck",num);
	}
	
	public void WithOpenUpdate(int num)
	{
		getSqlSession().selectOne("WithOpenUpdate",num);
	}
	
}



















