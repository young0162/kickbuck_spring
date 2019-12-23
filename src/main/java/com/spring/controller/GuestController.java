package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.service.GuestService;

@Controller
public class GuestController {

	@Autowired
	private GuestService service;
	
	@RequestMapping("/guest/list")
	public ModelAndView list()
	{
		ModelAndView model = new ModelAndView();
		int totalCount = service.getTotalCount();
		
		model.addObject("totalCount",totalCount);
		model.setViewName("/macro/guest/guestlist"); //tiles.xml 에서 지정한 이름으로 layout
		
		return model; 	
	}
	
}
