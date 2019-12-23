package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.GuestDao;

@Service
public class GuestService {
	
	@Autowired
	private GuestDao dao;
	
	public int getTotalCount()
	{
		return dao.getTotalCount(); 
	}
	
}
