package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.dto.FreeBoardCommentDto;
import com.spring.service.FreeBoardCommentService;



@RestController
@CrossOrigin
public class FreeBoardCommentContoller {
	@Autowired
	private FreeBoardCommentService fcService;
	
	@RequestMapping(value="/freeboardcomment/list", method=RequestMethod.GET)
	public List<FreeBoardCommentDto> getAllDatas(@RequestParam int num)
	{

		return fcService.getAllDatas(num);
	}
	
	@RequestMapping(value="/freeboardcomment/commentcount", method=RequestMethod.GET)
	public int getFreeCommentCount(int num)
	{
		System.out.println("react>>count");
		return fcService.getFreeCommentCount(num);
	}
	
	@PostMapping("/freeboardcomment/commentwrite")
	public void insertComment(@RequestBody FreeBoardCommentDto dto)
	{

		fcService.insertComment(dto);
		
		int gnum= fcService.freeboardgetGroupNum();
	
		fcService.freeboardupdateGroupNum(gnum);
		
	}
	
	@RequestMapping("/freeboardcomment/recommentwrite")
	public void insertReComment(@RequestBody FreeBoardCommentDto dto)
	{

		
		fcService.freeboardcommentinsertReComment(dto);
		
	}
	
	@RequestMapping(value="/freeboardcomment/commentdelete", method=RequestMethod.GET)
	public void deleteComment(@RequestParam int comment_num)
	{
	
		fcService.freeboardcommentdeleteComment(comment_num);		
	}

}
