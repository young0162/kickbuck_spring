package com.spring.dao;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class BucketDao extends SqlSessionDaoSupport{
	
	public int getTotalCount()
	{
		return getSqlSession().selectOne("guestTotalcount");
	}
	
}
