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

import com.spring.dto.QnaCommentDto;
import com.spring.service.QnaCommentService;

@RestController
@CrossOrigin
public class QnaCommetController {
	
	@Autowired
	private QnaCommentService qcservice;
	
	@RequestMapping(value="/qnacomment/list", method=RequestMethod.GET)
	public List<QnaCommentDto> getAllDatas(int num)
	{
		System.out.println("react>>list");
		return qcservice.getAllDatas(num);
	}
	
	@RequestMapping(value="/qnacomment/commentcount", method=RequestMethod.GET)
	public int getCommentCount(int num)
	{
		System.out.println("react>>count");
		return qcservice.getCommentCount(num);
	}
	
	@PostMapping("/qnacomment/commentwrite")
	public void insertComment(@RequestBody QnaCommentDto dto)
	{
		System.out.println("react>>add");
		System.out.println("데이타 확인 : "+ dto);
		
		qcservice.insertComment(dto);
		
		int gnum = qcservice.getCommentGroupNum();
		
		System.out.println("gnum:"+gnum );
		qcservice.updateCommentGroupNum(gnum);
		
	}
	
	@RequestMapping("/qnacomment/recommentwrite")
	public void insertReplyComment(@RequestBody QnaCommentDto dto)
	{
		System.out.println("react>>add");
		System.out.println("데이타 확인 : "+ dto);
		
		
		qcservice.insertReplyComment(dto);
		
	}
	
	
	@RequestMapping(value="/qnacomment/commentdelete", method=RequestMethod.GET)
	public void deleteComment(@RequestParam int comment_num)
	{
		System.out.println("react>>delete"+comment_num);
		qcservice.deleteComment(comment_num);		
	}

}
