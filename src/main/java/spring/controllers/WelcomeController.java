package spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import spring.model.Patient;

import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;

@Controller
@RequestMapping(path="/")
public class WelcomeController {
	@GetMapping("/admin")
	public String admin(ModelMap model)
	{
		model.addAttribute("firstName", "Ranger");
		model.addAttribute("user", "admin");
		return "welcomeAdmin";
	}
	@GetMapping("/provider")
	public String provider(ModelMap model)
	{
		model.addAttribute("firstName", "Jessica");
		model.addAttribute("user", "provider");
		return "welcomeProvider";
	}
	@GetMapping("/newPatient")
	public String patient(ModelMap model)
	{
		model.addAttribute("user", "patient");
		model.addAttribute("firstName", "patientName");
		Patient patient = new Patient();
		model.put("patient", patient);
		return "welcomePatient";
	}

}
