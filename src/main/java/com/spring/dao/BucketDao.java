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
	
	//나
	public List<BucketDto> getMyList(String user_name)
	{
		return getSqlSession().selectList("mypageMyBucketList",user_name);
	}
	//우리
	public void getOurList(String user_name,String type)
	{
		Map<String, String> map = new HashMap<String, String>();
		map.put("user_name",user_name);
		map.put("type",type);
		getSqlSession().update("mypageOurBucketList",map);
	}
	//대기
//	public void getStandbyList(String user_name,String type,Integer withcount)
//	{
//		Map<String, Integer> map = new HashMap<String, Integer>();
//		map.put("user_name",user_name);
//		map.put("type",type);
//		map.put("withcount",withcount);
//		getSqlSession().update("mypageStandbyBucketList",map);
//	}
//	//오프
//	public void getOffList(String user_name,String type)
//	{
//		Map<String, String> map = new HashMap<String, String>();
//		map.put("user_name",user_name);
//		map.put("type",type);
//		getSqlSession().update("mypageOffBucketList",map);
//	}
//	//공감
//	public void getlikeList(String user_name,Integer lilecount)
//	{
//		Map<String, Integer> map = new HashMap<String, Integer>();
//		map.put("user_name", user_name);
//		map.put("lilecount",lilecount);
//		getSqlSession().update("mypageLikeBucketList",map);
//	}	
}






















