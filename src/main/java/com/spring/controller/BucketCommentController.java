package com.spring.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.spring.dto.BucketDto;
import com.spring.dto.QnaCommentDto;
import com.spring.service.BucketCommentService;
import com.spring.service.BucketService;

import spring.react.util.SpringFileWriter;

@RestController
@CrossOrigin
public class BucketCommentController {

	@Autowired
	private BucketCommentService bservice;

	 
	 //bucket comment
	@RequestMapping(value="/bucketcomment/list", method=RequestMethod.GET)
	public List<QnaCommentDto> getAllDatas(@RequestParam int num)
	{
		System.out.println("react>>list");
		System.out.println("param : " + num);
		return bservice.getAllDatas(num);
	}
	
	@RequestMapping(value="/bucketcomment/commentcount", method=RequestMethod.GET)
	public int getCommentCount(@RequestParam int num)
	{
		System.out.println("react>>count");
		return bservice.getCommentCount(num);
	}
	
	@PostMapping("/bucketcomment/commentwrite")
	public void insertComment(@RequestBody QnaCommentDto dto)
	{
		System.out.println("react>>add");
		System.out.println("데이타 확인 : "+ dto);
		
		bservice.insertComment(dto);
		
		int gnum = bservice.getCommentGroupNum();
		
		System.out.println("gnum:"+gnum );
		bservice.updateCommentGroupNum(gnum);
		
	}
	
	@RequestMapping("/bucketcomment/recommentwrite")
	public void insertReplyComment(@RequestBody QnaCommentDto dto)
	{
		System.out.println("react>>add");
		System.out.println("데이타 확인 : "+ dto);
		
		
		bservice.insertReplyComment(dto);
		
	}
	
	
	@RequestMapping(value="/bucketcomment/commentdelete", method=RequestMethod.GET)
	public void deleteComment(@RequestParam int comment_num)
	{
		System.out.println("react>>delete"+comment_num);
		bservice.deleteComment(comment_num);		
	}
	 
}





















