package com.javaGuides.springboot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {
	@GetMapping("/iteration")
	public String iteration(Model model) {
		List<Employee> employees=new ArrayList<>();
		employees.add(new Employee("Bob", "Miller", "bob.miller@test.com"));
		employees.add(new Employee("Amy", "Jane", "amy.jane@test.com"));
		employees.add(new Employee("Tom", "Marks", "tom.marks@test.com"));
		employees.add(new Employee("John", "Deere", "jone.deere@test.com"));
		model.addAttribute("employees", employees);
		return "iteration";
	}
}
