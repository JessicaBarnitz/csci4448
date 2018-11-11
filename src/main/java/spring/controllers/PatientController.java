package spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;

@Controller
@RequestMapping(path="/")
public class PatientController {
//	@GetMapping("/billing")
//	public String billingInformation(ModelMap model)
//	{
////		model.addAttribute("firstName", "Ranger");
////		model.addAttribute("user", "admin");
//		return "BillingInformation";
//	}
}