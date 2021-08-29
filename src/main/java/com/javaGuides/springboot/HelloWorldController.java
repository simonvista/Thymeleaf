package com.javaGuides.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {
	@GetMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("msg", "hello world");
		return "hello";
	}
	@GetMapping("/style")
	public String style() {
		return "add-css-js";
	}
}
