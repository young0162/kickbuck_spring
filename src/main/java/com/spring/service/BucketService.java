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
	
	public void OffUpdate(int num)
	{
		dao.OffUpdate(num);
	}
	
	public List<BucketDto> OffSelect()
	{
		return dao.OffSelect();
	}
	
}
