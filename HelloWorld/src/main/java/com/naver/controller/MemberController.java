package com.naver.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/member")
public class MemberController {
	
	@RequestMapping(value="insert", method = RequestMethod.GET)
	public String insertui() {
		return "member/insert";
	}
	
	@RequestMapping(value="insert", method = RequestMethod.POST)
	public String insert() {
		return null;
	}
	
	
	@RequestMapping(value="update", method = RequestMethod.POST) 
	public String update() {
		return null;
	}
	
	@RequestMapping(value="update")
	public String updateui() {
		return null;
	}
	
	@RequestMapping(value="delete", method = RequestMethod.GET)
	public void delete() {
		
	}
}
