package com.spring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.spring.dto.ProfileDto;
import com.spring.service.ProfileService;

import spring.react.util.SpringFileWriter;

@RestController
@CrossOrigin
public class ProfileController {

	@Autowired
	private ProfileService pService;
	
	@RequestMapping("/profileinsert/input")
	public String insertProfile(
			@RequestBody ProfileDto dto)
	
	{
		System.out.println("react>>add");
		System.out.println("확인"+dto);
		
		
		pService.insertProfile(dto);
		
		return "DB Save Success!!";
	}
	
	@RequestMapping(value = "/select",method=RequestMethod.GET)
	public ProfileDto selectMember(@RequestParam int num){
		System.out.println("react>>select>>"+num);
		return pService.getData(num);
	}

	//수정
	@RequestMapping("/profile/update")
	public void updateMember(@RequestBody ProfileDto dto)
	{
		System.out.println("react>>update"+dto);
		pService.updateProfile(dto);
	}
	
	//이미지 업로드
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
}















