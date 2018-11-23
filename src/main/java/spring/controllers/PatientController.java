package spring.controllers;

import spring.model.User;
import spring.model.BillingInformation;
import spring.model.Patient;

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
public class PatientController {
	
	@PostMapping("/patient")
	public String viewPatient(@ModelAttribute("patient") Patient patient) {
//		change this to patient specific //https://www.codejava.net/frameworks/spring/spring-mvc-form-handling-tutorial-and-example
		System.out.println(patient);
		System.out.println("First Name: " + patient.getFirstName());
		System.out.println("Last Name: " + patient.getLastName());
		System.out.println("Date of Birth: " + patient.getDateOfBirth());
		return "Patient";
	}
}