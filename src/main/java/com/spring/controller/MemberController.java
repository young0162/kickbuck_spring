package com.spring.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.dto.MemberDto;
import com.spring.service.MemberService;

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
		int num = mservice.loginCheck(map.get("email1"),map.get("password"));
		System.out.println(num);
		
		return num;
	}

	
}
