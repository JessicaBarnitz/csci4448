package spring.controllers;

import spring.model.Address;
import spring.model.Admin;
import spring.model.CurrentPatient;
import spring.model.CurrentUser;
import spring.model.HealthcareProvider;
import spring.model.MedicalOffice;
import spring.model.Patient;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.ui.ModelMap;


@Controller
@SessionAttributes("patient")
@RequestMapping(value="/")
public class PatientController {
	
	@GetMapping("/newPatient")
	public String newPatient(ModelMap model)
	{
		model.addAttribute("firstName", "patientName"); //default attributes
		model.addAttribute("user", "patient"); //default attributes
		
		Patient patient = new Patient();
		model.put("patient", patient);
		return "welcomePatient";
	}
	
	@GetMapping("/patient")
	public String patient(@ModelAttribute("patient") Patient patient) {
		System.out.println(patient);
		CurrentPatient.patient = patient;
		CurrentUser.userPage = "Patient";
		
		//observer design pattern - notify observers of change
		MedicalOffice medicalOffice = MedicalOffice.getInstance("Boulder Health", new Address("123 Main Street", "Longmont", "Boulder", "Colorado", "80504"), "303-123-4567", "http://localhost:8080/SpringMVCTutorial/", new ArrayList<HealthcareProvider>(), new ArrayList<Admin>(), new ArrayList<Patient>());
		medicalOffice.setState("********Observer Update********\nNew patient added to the Healthcare Portal: " + patient.getFirstName() + " " + patient.getLastName() + ", id: " + patient.getPatientID());
				
		System.out.println("First Name: " + patient.getFirstName());
		System.out.println("Last Name: " + patient.getLastName());
		System.out.println("Date of Birth: " + patient.getDateOfBirth());
		System.out.println("patient ID: " + patient.getPatientID());
		
		return "Patient";
	}
	
	@PostMapping("/patient")
	public String viewPatient(@ModelAttribute("patient") Patient patient) {
		System.out.println(patient);
		MedicalOffice.addPatient(patient);
		
		CurrentPatient.patient = patient;
		CurrentUser.userPage = "Patient";
		
		//observer design pattern - notify observers of change
		MedicalOffice medicalOffice = MedicalOffice.getInstance("Boulder Health", new Address("123 Main Street", "Longmont", "Boulder", "Colorado", "80504"), "303-123-4567", "http://localhost:8080/SpringMVCTutorial/", new ArrayList<HealthcareProvider>(), new ArrayList<Admin>(), new ArrayList<Patient>());
		medicalOffice.setState("********Observer Update********\nNew patient added to the Healthcare Portal: " + patient.getFirstName() + " " + patient.getLastName() + ", id: " + patient.getPatientID());
				
		System.out.println("First Name: " + patient.getFirstName());
		System.out.println("Last Name: " + patient.getLastName());
		System.out.println("Date of Birth: " + patient.getDateOfBirth());
		System.out.println("patient ID: " + patient.getPatientID());
		
		return "Patient";
	}
}