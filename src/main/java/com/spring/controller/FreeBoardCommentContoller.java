package com.spring.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.spring.service.FreeBoardCommentService;
import com.spring.service.FreeBoardService;

@RestController
@CrossOrigin
public class FreeBoardCommentContoller {
	
	private FreeBoardCommentService fcService;

}
