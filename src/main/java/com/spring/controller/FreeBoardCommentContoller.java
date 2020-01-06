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
		System.out.println("react>>commentlist"+num);
		
		return fcService.getAllDatas(num);
	}
	
	@PostMapping("/freeboardcomment/commentwrite")
	public void insertComment(@RequestBody FreeBoardCommentDto dto)
	{
		System.out.println("react>>commentadd");
		System.out.println("데이타 확인 : "+ dto);
		
		fcService.insertComment(dto);
		
		int gnum= fcService.freeboardgetGroupNum();
		
		System.out.println("gnum:"+gnum );
		fcService.freeboardupdateGroupNum(gnum);
		
	}
	
	@RequestMapping("/freeboardcomment/recommentwrite")
	public void insertReComment(@RequestBody FreeBoardCommentDto dto)
	{
		System.out.println("react>>commentadd");
		System.out.println("데이타 확인 : "+ dto);
		
		
		fcService.freeboardcommentinsertReComment(dto);
		
	}
	
	@RequestMapping(value="/freeboardcomment/commentdelete", method=RequestMethod.GET)
	public void deleteComment(@RequestParam int comment_num)
	{
		System.out.println("react>>commentdelete"+comment_num);
		fcService.freeboardcommentdeleteComment(comment_num);		
	}

}
