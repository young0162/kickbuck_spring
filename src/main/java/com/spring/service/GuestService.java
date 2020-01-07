package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.GuestDao;
import com.spring.dto.GuestDto;

@Service
public class GuestService {

	@Autowired
	private GuestDao dao;
	
	public List<GuestDto> getGuestList() {
		return dao.getGuestList();
	}

	public void insertGuest(GuestDto dto) {
		dao.insertGuest(dto);
	}
}