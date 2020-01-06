package com.spring.dao;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.spring.dto.BucketDto;
import com.spring.dto.OffBucketDto;

@Repository
public class OffBucketDao extends SqlSessionDaoSupport{
	
	//오프한 버킷리스트 모두 불러오기 
	public List<BucketDto> getOffBucketList()
	{
		return getSqlSession().selectList("offBucketAllList");
	}
	
	//버킷리스트 후기 불러오기
	public List<OffBucketDto> getOffBucketCommentList(int num)
	{
		return getSqlSession().selectList("offBucketCommentAllList",num);
	}
	
	//버킷디태일
	public BucketDto getBucketData(int num)
	{
		return getSqlSession().selectOne("offBucketSelectOne", num);
	}
	
	//버킷 후기 입력
	public void insertOffBucketComment(OffBucketDto dto)
	{
		getSqlSession().insert("offBucketComment", dto);
	}
	


}
