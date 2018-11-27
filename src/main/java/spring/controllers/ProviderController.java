package spring.controllers;

import spring.model.User;
import spring.model.HealthcareProvider;
import spring.model.MedicalOffice;

import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpSession;

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
public class ProviderController {
	
	@GetMapping("/newProvider")
	public String provider(ModelMap model)
	{
		HealthcareProvider provider = new HealthcareProvider();
		model.put("provider", provider);
		return "welcomeProvider";
	}
	
	@PostMapping("/provider")
	public String viewPatient(@ModelAttribute("provider") HealthcareProvider provider) {
		System.out.println(provider);
		MedicalOffice.addHealthcareProvider(provider);
		
		System.out.println("First Name: " + provider.getFirstName());
		System.out.println("Last Name: " + provider.getLastName());
		System.out.println("Date of Birth: " + provider.getDateOfBirth());

		System.out.println(MedicalOffice.showHealthcareProviders());
		return "Provider";
	}
	
}