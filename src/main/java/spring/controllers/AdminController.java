package spring.controllers;

import spring.model.User;
import spring.model.Admin;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;


@Controller
@RequestMapping(value="/")
public class AdminController {
	
	@PostMapping("/admin")
	public String viewPatient(@ModelAttribute("admin") Admin admin) {
//		change this to patient specific //https://www.codejava.net/frameworks/spring/spring-mvc-form-handling-tutorial-and-example
		System.out.println(admin);
		System.out.println("First Name: " + admin.getFirstName());
		System.out.println("Last Name: " + admin.getLastName());
		System.out.println("Date of Birth: " + admin.getDateOfBirth());
		return "Admin";
	}
}