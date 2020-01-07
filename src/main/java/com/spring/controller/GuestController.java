package com.spring.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.spring.dto.GuestDto;
import com.spring.service.GuestService;


@RestController
@CrossOrigin
public class GuestController {
	
	@Autowired
	private GuestService gservice;
	
	@RequestMapping("/guestsave")
	public void insertGuest(@RequestBody GuestDto dto)
	{
		gservice.insertGuest(dto);
	}
	
	@RequestMapping("/guestselect")
	public List<GuestDto> selectGuest()
	{
		return gservice.getGuestList();
	}
	
}