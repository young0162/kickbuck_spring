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
	
	public void bucketWithUp(int num)
	{
		dao.bucketWithUp(num);
	}
	
	public void bucketLiekUp(int num)
	{
		dao.bucketLikeUp(num);
	}
	
	public List<BucketDto> AllSelect()
	{
		return dao.AllSelect();
	}
	
}
