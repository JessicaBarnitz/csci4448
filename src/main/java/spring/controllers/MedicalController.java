package spring.controllers;

import java.util.ArrayList;
import java.util.Map;
//import java.util.List;
//import java.util.ArrayList;

import spring.model.Address;
import spring.model.Admin;
import spring.model.BillingInformation;
import spring.model.CurrentAdmin;
import spring.model.CurrentPatient;
import spring.model.CurrentProvider;
import spring.model.HealthcareProvider;
import spring.model.MedicalInformation;
import spring.model.MedicalOffice;
import spring.model.Patient;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.ui.Model;
//import org.springframework.ui.ModelMap;

@Controller
@RequestMapping(value="/medical")
public class MedicalController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String viewMedicalInformation(Map<String, Object> model) {
		MedicalInformation medicalInformationForm = new MedicalInformation();
		
		model.put("medicalInformationForm", medicalInformationForm);
		model.put("patient", CurrentPatient.patient);
		model.put("admin", CurrentAdmin.admin);
		model.put("provider", CurrentProvider.provider);
		
		return "MedicalInformation";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String processMedicalInformation(@ModelAttribute("medicalInformationForm") MedicalInformation medicalInformation, Map<String, Object> model) {
		//implement logic
		Patient patient = CurrentPatient.patient;
		CurrentPatient.patient.setMedicalInformation(medicalInformation);
		
		model.put("patient", CurrentPatient.patient);
		model.put("admin", CurrentAdmin.admin);
		model.put("provider", CurrentProvider.provider);
		
		//observer design pattern - notify observers of change
		MedicalOffice medicalOffice = MedicalOffice.getInstance("Boulder Health", new Address("123 Main Street", "Longmont", "Boulder", "Colorado", "80504"), "303-123-4567", "http://localhost:8080/SpringMVCTutorial/", new ArrayList<HealthcareProvider>(), new ArrayList<Admin>(), new ArrayList<Patient>());
		medicalOffice.setState("********Observer Update********\nMedical Information Updated for Patient: " + patient.getFirstName() + " " + patient.getLastName() + ", id: " + patient.getPatientID());
				
		//testing purposes
		System.out.println("Allergies: " + medicalInformation.getAllergies());
		System.out.println("Immunizations: " + medicalInformation.getImmunizations());
		System.out.println("Current Medications: " + medicalInformation.getCurrentMedications());
		System.out.println("Mental Status Exam: " + medicalInformation.getMentalStatusExam());
		
		return "MedicalInformationSuccess";
	}
}