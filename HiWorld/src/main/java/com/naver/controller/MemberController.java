package com.naver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/member")
public class MemberController {

	@RequestMapping(value = "insert", method = RequestMethod.POST)
	public String insert() {
		return "redirect:/member/list";
	}
	
	@RequestMapping(value = "insert", method = RequestMethod.GET)
	public String insertui() {
		return "member/insert";
	}
}
