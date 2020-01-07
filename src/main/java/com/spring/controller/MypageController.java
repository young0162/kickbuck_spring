package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.dto.MypageDto;
import com.spring.service.MypageService;

@RestController
@CrossOrigin
public class MypageController {

	@Autowired
	private MypageService yService;
	
	@RequestMapping("/list")
	public List<MypageDto> getAllList(
			@RequestParam(value = "start", defaultValue = "0") int start)
	{
		System.out.println("react>>list");
System.out.println("start="+start);
		
		return yService.getAllList(start);
	}
	
	@RequestMapping("/select")
	public MypageDto select(@RequestParam int num){
		return yService.getData(num);
	}
}
