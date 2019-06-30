package com.student.course.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StaticController {
	@RequestMapping("/home")
	public String home() {
		return "index";
	}
}