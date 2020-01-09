package com.spring.controller;

import java.util.List;

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


import com.spring.dto.WithBoardDto;
import com.spring.service.WithBoardService;

import spring.react.util.SpringFileWriter;

@RestController
@CrossOrigin
public class WithBoardController {
	
	@Autowired
	private WithBoardService wservice;
	
	@RequestMapping("/bucket/withboardlist")
	public List<WithBoardDto> getAllDatas(@RequestParam int num)
	{
		System.out.println("react>>list");
		return wservice.getAllDatas(num); 
	}
	
	@RequestMapping(value = "/bucket/withboard/save",consumes = {"multipart/form-data"},
			method = RequestMethod.POST)
	public String imageUpload(HttpServletRequest request,
			@RequestParam MultipartFile uploadFile)
	{
		System.out.println("react>>upload>>"+uploadFile.getOriginalFilename());
		//업로드 경로
		String path=request.getSession().getServletContext().getRealPath("/save");
		System.out.println("path:"+path);
		//이미지저장
		SpringFileWriter sfw = new SpringFileWriter();
		sfw.writeFile(uploadFile, path);
		
		return "success";
	}
	

	@PostMapping("/bucket/withboardinsert")
	public void insertComment(@RequestBody WithBoardDto dto)
	{
		System.out.println("react>>add");
		System.out.println("데이타 확인 : "+ dto);
		
		wservice.insertComment(dto);
		
		int gnum = wservice.getCommentGroupNum();
		
		System.out.println("gnum:"+gnum );
		wservice.updateCommentGroupNum(gnum);
		
	}
	
	// 댓글 등록
	@RequestMapping("/bucket/withreplyinsert")
	public void insertWithReplyComment(@RequestBody WithBoardDto dto)
	{
		System.out.println("react>>add");
		System.out.println("데이타 확인 : "+ dto);
		
		wservice.insertWithReplyComment(dto);
	}
	
	// 댓글 삭제
	@RequestMapping(value="/bucket/withcommentdelete", method=RequestMethod.GET)
	public void deleteWithComment(@RequestParam int with_num)
	{
		System.out.println("react>>delete"+with_num);
		wservice.deleteWithComment(with_num);		
	}

	
	@RequestMapping("/bucket/withimagenames")
	public List<String> getImageNames(@RequestParam int num)
	{
		return wservice.getImageNames(num);
	}
	
}
