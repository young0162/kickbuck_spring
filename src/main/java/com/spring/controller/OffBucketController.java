package com.spring.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.spring.dto.BucketDto;
import com.spring.dto.OffBucketDto;
import com.spring.service.OffBucketService;

import spring.react.util.SpringFileWriter;

@RestController
@CrossOrigin
public class OffBucketController {
	
	@Autowired
	private OffBucketService offService;
	
	//이미지
	@RequestMapping(value = "/bucket/off/save",consumes = {"multipart/form-data"},
			method = RequestMethod.POST)
	public String imageUpload(HttpServletRequest request,
			@RequestParam MultipartFile uploadFile)
	{
		System.out.println("react>>offbucketupload>>"+uploadFile.getOriginalFilename());
		//업로드 경로
		String path=request.getSession().getServletContext().getRealPath("/save");
		System.out.println("path:"+path);
		//이미지저장
		SpringFileWriter sfw = new SpringFileWriter();
		sfw.writeFile(uploadFile, path);
		
		return "success";
	}
	
	//Comment insert
	@RequestMapping("bucket/bucketcomment/input")
	public String insertOffBucketComment(
			@RequestBody OffBucketDto dto)
	
	{
		System.out.println("react>>offBucketCommentAdd");
		System.out.println("확인"+dto);
		
		
		offService.insertOffBucketComment(dto);
		
		return "DB Save Success!!";
	}
	
	//offbucket List
	@RequestMapping("/bucket/bucketlist")
	public List<BucketDto> getOffBucketAllDatas()
	{
		
		System.out.println("offbucketlist");
		
		return offService.getOffBucketList();
	}
	
	//offbucketComment List
	@RequestMapping("/bucket/offbucketcommentlist")
	public List<OffBucketDto> getOffBucketcommentAllDatas(@RequestParam int num)
	{
		
		System.out.println("offbucketcommentlist");
		
		return offService.getOffBucketCommentList(num);
	}
	
	//bucketdetail
	@RequestMapping("/bucket/detail")
	public BucketDto getBucketData(
			@RequestParam int num)
	{
		System.out.println("bucketdatail="+num);
		return offService.getBucketData(num);
	}
	
}
