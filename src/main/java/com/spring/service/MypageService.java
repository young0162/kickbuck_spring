package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.MypageDao;
import com.spring.dto.MypageDto;

@Service
public class MypageService {

	@Autowired
	private MypageDao dao;
	
	public List<MypageDto> getAllList(int start){
		return dao.getAllList(start);
	}
	
	public MypageDto getData(int num) {
		return dao.getData(num);
	}
}
