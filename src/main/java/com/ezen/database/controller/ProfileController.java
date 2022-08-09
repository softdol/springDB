package com.ezen.database.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j2;

@Log4j2
@RequestMapping(value = "/profile")
@Controller
public class ProfileController {
	
	@GetMapping("/")
	public String index() {
		//log.info("자기소개 - 개발중");
		return "profile/index";
	}
}
