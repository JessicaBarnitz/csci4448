package spring.controllers;

import spring.model.MedicalOffice;
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
	
	@GetMapping("/newPatient")
	public String patient(ModelMap model)
	{
		model.addAttribute("firstName", "patientName"); //default attributes
		model.addAttribute("user", "patient"); //default attributes
		
		Patient patient = new Patient();
		model.put("patient", patient);
		System.out.println("1 patient ID: " + patient.getPatientID());
		return "welcomePatient";
	}
	
	@PostMapping("/patient")
	public String viewPatient(@ModelAttribute("patient") Patient patient) {
		System.out.println(patient);
		MedicalOffice.addPatient(patient);
		
		System.out.println("First Name: " + patient.getFirstName());
		System.out.println("Last Name: " + patient.getLastName());
		System.out.println("Date of Birth: " + patient.getDateOfBirth());
		System.out.println("patient ID: " + patient.getPatientID());
		
		return "Patient";
	}
}