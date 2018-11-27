package spring.controllers;

import spring.model.User;
import spring.model.Admin;
import spring.model.MedicalOffice;

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
	
	@GetMapping("/newAdmin")
	public String admin(ModelMap model)
	{
		Admin admin = new Admin();
		model.put("admin", admin);
		return "welcomeAdmin";
	}
	
	@PostMapping("/admin")
	public String viewPatient(@ModelAttribute("admin") Admin admin) {
		System.out.println(admin);
		MedicalOffice.addAdmin(admin);
		
		System.out.println("First Name: " + admin.getFirstName());
		System.out.println("Last Name: " + admin.getLastName());
		System.out.println("Date of Birth: " + admin.getDateOfBirth());
		
		System.out.println(MedicalOffice.showAdmin());
		return "Admin";
	}
}