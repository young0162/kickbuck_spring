package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.FreeBoardCommentDao;
import com.spring.dto.FreeBoardCommentDto;

@Service
public class FreeBoardCommentService {
	@Autowired
	private FreeBoardCommentDao dao;
	
	public List<FreeBoardCommentDto> getAlldatas()
	{
		return dao.getAlldatas();
	}
}
