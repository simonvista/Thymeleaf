package com.javaGuides.springboot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
	@GetMapping("/if-unless")
	public String ifUnless(Model model) {
		List<User> users=new ArrayList<>();
		users.add(new User("Amy","amy@test.com","ADMIN"));
		users.add(new User("Bob","bob@test.com","USER"));
		users.add(new User("John","john@test.com","USER"));
		model.addAttribute("users", users);
		return "if-unless";
	}
	@GetMapping("switch-case")
	public String switchCase(Model model) {
		User user=new User("Amy","amy@test.com","ADMIN");
		model.addAttribute("user", user);
		return "switch-case";
	}
}
