package com.spring.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.spring.dto.BucketDto;
import com.spring.service.BucketService;

import spring.react.util.SpringFileWriter;

@RestController
@CrossOrigin
public class BucketController {

	@Autowired
	private BucketService bservice;
	
	@RequestMapping(value = "/save",consumes = {"multipart/form-data"},
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
	
	@RequestMapping("/bucketadd")
	public void insertBucket(@RequestBody BucketDto dto)
	{
		System.out.println("react >> bucket insert");
		bservice.insertBucket(dto);
	}
	
	@RequestMapping(value="/bucketwithup", method = RequestMethod.GET)
	public void bucketWithUp(@RequestParam int num)
	{
		System.out.println("react >> bucket with update");
		bservice.bucketWithUp(num);
	}
	
	@RequestMapping(value="/bucketlikeup", method = RequestMethod.GET)
	public void bucketLikeUp(@RequestParam int num)
	{
		System.out.println("react >> bucket like update");
		bservice.bucketLiekUp(num);
	}
	
	@RequestMapping("/allselect")
	public List<BucketDto> AllSelect()
	{
		System.out.println("react >> bucket list all");
		return bservice.AllSelect();
	}
	
}
