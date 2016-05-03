package com.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/sample")
public class HelloWorldController {
	@RequestMapping("/helloWorld")
	@ResponseBody
	public String helloWorld(@RequestParam(required = false) String name) {
		if (name != null) {
			return "Hello " + name;
		}
		
		return "Hello World ";
	}
	
	@RequestMapping("/hello")
	public String helloHtml(@RequestParam(required = false) String name, @RequestParam(required = false) String id, Model model) {
		model.addAttribute("name", name);
		model.addAttribute("id", id);
		
		return "hello";
	}
	
}
