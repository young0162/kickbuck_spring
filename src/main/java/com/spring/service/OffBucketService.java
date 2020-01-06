package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.OffBucketDao;
import com.spring.dto.BucketDto;
import com.spring.dto.OffBucketDto;

@Service
public class OffBucketService {
	@Autowired
	private OffBucketDao dao;
	
	//오프한 버킷 모두 불러오기
	public List<BucketDto> getOffBucketList()
	{
		return dao.getOffBucketList();
	}
	
	//버킷 후기 불러오기
	public List<OffBucketDto> getOffBucketCommentList(int num)
	{
		return dao.getOffBucketCommentList(num);
	}
	
	//버킷디태일
	public BucketDto getBucketData(int num)
	{
		return dao.getBucketData(num);
	}
	
	//버킷 후기 입력
	public void insertOffBucketComment(OffBucketDto dto)
	{
		dao.insertOffBucketComment(dto);
	}


}
