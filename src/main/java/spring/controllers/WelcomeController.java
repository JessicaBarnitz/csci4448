package spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import spring.model.Admin;
import spring.model.HealthcareProvider;
import spring.model.Patient;

import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;

@Controller
@RequestMapping(path="/")
public class WelcomeController {
	
	@GetMapping("/newAdmin")
	public String admin(ModelMap model)
	{
		model.addAttribute("firstName", "adminName");  //default attributes
		model.addAttribute("user", "admin");  //default attributes
		
		Admin admin = new Admin();
		model.put("admin", admin);
		return "welcomeAdmin";
	}

	@GetMapping("/newProvider")
	public String provider(ModelMap model)
	{
		model.addAttribute("firstName", "providerName");  //default attributes
		model.addAttribute("user", "provider"); //default attributes
		
		HealthcareProvider provider = new HealthcareProvider();
		model.put("provider", provider);
		return "welcomeProvider";
	}
	
	@GetMapping("/newPatient")
	public String patient(ModelMap model)
	{
		model.addAttribute("firstName", "patientName"); //default attributes
		model.addAttribute("user", "patient"); //default attributes
		
		Patient patient = new Patient();
		model.put("patient", patient);
		return "welcomePatient";
	}

}
