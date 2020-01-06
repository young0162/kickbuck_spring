package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.dto.QnADto;
import com.spring.service.QnAService;

@RestController
@CrossOrigin
public class QnAController {
	
	@Autowired
	private QnAService qservice;
	
	
	@RequestMapping(value="/qnaboard/list", method=RequestMethod.GET)
	public List<QnADto> getAllDatas(
			@RequestParam(value = "start", defaultValue = "0") int start
			)
	{
		System.out.println("react>>list");
		System.out.println("start="+start);
		
		return qservice.getAllDatas(start);
	}
	
	@RequestMapping("/qnaboard/write")
	public void insertData(@RequestBody QnADto dto)
	{
		System.out.println("react>>add");
		System.out.println("데이타 확인 : "+ dto);
		
		qservice.insertData(dto);
			
	}
	
	@RequestMapping(value="/qnaboard/delete", method=RequestMethod.GET)
	public void deleteData(@RequestParam int num)
	{
		System.out.println("react>>delete"+num);
		
		qservice.deleteData(num);
	}
	
	@RequestMapping(value="/qnaboard/select", method=RequestMethod.GET)
	public QnADto getData(@RequestParam int num)
	{
		System.out.println("react>>select>>" + num);
		
		qservice.updateReadCount(num); // 조회수 증가
		return qservice.getData(num);
	}
	
	@RequestMapping("/qnaboard/update")
	public void updateData(@RequestBody QnADto dto)
	{
		System.out.println("react>>update");
		System.out.println("데이타 확인 : "+ dto);
		
		qservice.updateData(dto);
	}

}
