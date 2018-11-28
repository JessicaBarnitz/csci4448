package spring.controllers;

import java.util.ArrayList;
import java.util.Map;
//import java.util.List;
//import java.util.ArrayList;

import spring.model.Address;
import spring.model.Admin;
import spring.model.CurrentAdmin;
import spring.model.CurrentPatient;
import spring.model.CurrentProvider;
import spring.model.HealthcareProvider;
import spring.model.MedicalOffice;
import spring.model.Patient;
import spring.model.PersonalInformation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.ui.Model;
//import org.springframework.ui.ModelMap;

@Controller
@RequestMapping(value="/personal")
public class PersonalController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String viewPersonalInformation(Map<String, Object> model) {
//		change this to patient specific //https://www.codejava.net/frameworks/spring/spring-mvc-form-handling-tutorial-and-example
		PersonalInformation personalInformationForm = new PersonalInformation();
		Address address = new Address();
		personalInformationForm.setHomeAddress(address);
		
		model.put("personalInformationForm", personalInformationForm);
		model.put("patient", CurrentPatient.patient);
		model.put("admin", CurrentAdmin.admin);
		model.put("provider", CurrentProvider.provider);
		
		return "PersonalInformation";
	}
	@RequestMapping(method = RequestMethod.POST)
	public String processPersonalInformation(@ModelAttribute("personalInformationForm") PersonalInformation personalInformation, Map<String, Object> model) {
		//implement logic
		Patient patient = CurrentPatient.patient;
		CurrentPatient.patient.setPersonalInformation(personalInformation);
		model.put("patient", CurrentPatient.patient);
		model.put("admin", CurrentAdmin.admin);
		model.put("provider", CurrentProvider.provider);
		
		//observer design pattern - notify observers of change
		MedicalOffice medicalOffice = MedicalOffice.getInstance("Boulder Health", new Address("123 Main Street", "Longmont", "Boulder", "Colorado", "80504"), "303-123-4567", "http://localhost:8080/SpringMVCTutorial/", new ArrayList<HealthcareProvider>(), new ArrayList<Admin>(), new ArrayList<Patient>());
		medicalOffice.setState("********Observer Update********\nPersonal Information Updated for Patient: " + patient.getFirstName() + " " + patient.getLastName() + ", id: " + patient.getPatientID());
				
		//testing purposes
		System.out.println("Contact Phone: " + personalInformation.getPhone());
		System.out.println("Contact Email: " + personalInformation.getEmail());
		System.out.println("Emergency Contact Phone: " + personalInformation.getEmergencyContactPhone());
		System.out.println("Emergency Contact Name: " + personalInformation.getEmergencyContactName());
		
		return "PersonalInformationSuccess";
	}
}