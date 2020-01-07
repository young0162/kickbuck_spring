package com.spring.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.spring.dto.MemberDto;
import com.spring.service.MemberService;

import spring.react.util.SpringFileWriter;

@RestController
@CrossOrigin
public class MemberController {

	@Autowired
	private MemberService mservice;
	
	@RequestMapping("/signup")
	public void insertMember(@RequestBody MemberDto dto)
	{	
		System.out.println("react>>insert");
		mservice.insertMember(dto);
	}
	
	@RequestMapping("/login")
	public int loginCheck(@RequestBody Map<String, String> map)
	{ 
		System.out.println("react>>login");
		int num = mservice.loginCheck(map.get("user_name"),map.get("password"));
		System.out.println(num);
		
		return num;
	}
	
	@RequestMapping(value="/emailcheck", method = RequestMethod.GET)
	public int emailCheck(@RequestParam String email)
	{
		System.out.println(email);
		return mservice.emailCheck(email); 
	}
	
	@RequestMapping(value="/usernamecheck", method = RequestMethod.GET)
	public int UserNameCheck(@RequestParam String user_name)
	{
		System.out.println(user_name);
		System.out.println(mservice.UserNameCheck(user_name));
		return mservice.UserNameCheck(user_name);
		
	}
	
	@RequestMapping(value = "/profile/select",method=RequestMethod.GET)
	public MemberDto selectMember(@RequestParam int num){
		System.out.println("react>>select>>"+num);
		return mservice.getData(num);
	}

	//수정
	@RequestMapping("/profile/update")
	public void updateProfile(@RequestBody MemberDto dto)
	{
		System.out.println("react>>update"+dto);
		mservice.updateProfile(dto);
	}
	
	//이미지 업로드
	@RequestMapping(value = "/profile/upload",consumes = {"multipart/form-data"},
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
	
	//react로부터 데이터 전송받기
	@RequestMapping("/profile/save")
	public String submit(@RequestBody MemberDto dto){
		System.out.println("react>>save>>");
		System.out.println(dto);
		return "DB Save Success!!";
	}
	
	@RequestMapping(value = "/profile/image",method=RequestMethod.GET)
	public MemberDto selectImage(@RequestParam int num){
		System.out.println("react>>image>>"+num);
		return mservice.getImage(num);
	}
}
