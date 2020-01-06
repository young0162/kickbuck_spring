package com.spring.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.dto.FreeBoardCommentDto;
import com.spring.service.FreeBoardCommentService;


@RestController
@CrossOrigin
public class FreeBoardCommentContoller {
	
	private FreeBoardCommentService fcService;
	
	
	@RequestMapping("/detail/freeboardcomment")
	public List<FreeBoardCommentDto> getAllDatas()
	{
		System.out.println("detail>>comment");
		
		return fcService.getAlldatas();
	}

}
