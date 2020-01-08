package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.BucketDao;
import com.spring.dto.BucketDto;

@Service
public class BucketService {

	@Autowired
	private BucketDao dao;

	public void insertBucket(BucketDto dto)
	{
		dao.insertBucket(dto);
	}

	public void bucketWithUp(String user_name, String num)
	{
		dao.bucketWithUp(user_name, num);
	}

	public void bucketLiekUp(String user_name, String num)
	{
		dao.bucketLikeUp(user_name, num);
	}

	public List<BucketDto> AllSelect()
	{
		return dao.AllSelect();
	}

	public BucketDto OneSelect(int num)
	{
		return dao.OneSelect(num);
	}

	public List<BucketDto> SearchSelect(String keyword)
	{
		return dao.SearchSelect(keyword);
	}

	
	//나
	public List<BucketDto> getMyList(String user_name)
	{
		return dao.getMyList(user_name);
	}
	
	//우리
	public List<BucketDto> getOurList(String user_name)
	{
		return dao.getOurList(user_name);
	}
	
	public void OffUpdate(int num) 
	{ 
		dao.OffUpdate(num); 
	}
	  
	public List<BucketDto> OffSelect()
    {
	    return dao.OffSelect(); 
    }
	  
	public BucketDto OffOneSelect(int num) 
	{ 
		return dao.OffOneSelect(num); 
	}
	 
	public List<BucketDto> SoloSelect() 
	{ 
		return dao.SoloSelect(); 
	}
	  
	public List<BucketDto> WithSelect() 
	{
		return dao.WithSelect(); 
	}
	  
	public BucketDto BucketWithCheck(int num) 
	{
		return dao.BucketWithCheck(num);
	}
	
}



























