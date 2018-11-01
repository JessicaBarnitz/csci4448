package spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
	@GetMapping("/patient")
	public String patient(ModelMap model)
	{
		model.addAttribute("firstName", "Justin");
		model.addAttribute("user", "patient");
		return "welcomePatient";
	}

}