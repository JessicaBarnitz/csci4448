package spring.controllers;

import spring.model.User;
import spring.model.Address;
import spring.model.Admin;
import spring.model.BillingInformation;
import spring.model.CurrentAdmin;
import spring.model.CurrentPatient;
import spring.model.CurrentProvider;
import spring.model.CurrentUser;
import spring.model.HealthcareProvider;
import spring.model.MedicalOffice;
import spring.model.Patient;

import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;


@Controller
@SessionAttributes("admin")
@RequestMapping(value="/")
public class AdminController {
	
	@GetMapping("/newAdmin")
	public String admin(ModelMap model, HttpSession session)
	{
		Admin admin = new Admin();
		CurrentProvider.provider = null;
		CurrentPatient.patient = null;
		model.put("admin", admin);
		return "welcomeAdmin";
	}
	
	@PostMapping("/admin")
	public String viewPatient(@ModelAttribute("admin") Admin admin, ModelMap model, HttpSession session) {
		System.out.println(admin);
		//observer design pattern - notify observers of change
		MedicalOffice medicalOffice = MedicalOffice.getInstance("Boulder Health", new Address("123 Main Street", "Longmont", "Boulder", "Colorado", "80504"), "303-123-4567", "http://localhost:8080/SpringMVCTutorial/", new ArrayList<HealthcareProvider>(), new ArrayList<Admin>(), new ArrayList<Patient>());		
		medicalOffice.addObserver(admin);
		CurrentAdmin.admin = admin;
		CurrentUser.userPage = "Admin";
		
		System.out.println("First Name: " + admin.getFirstName());
		System.out.println("Last Name: " + admin.getLastName());
		System.out.println("Date of Birth: " + admin.getDateOfBirth());
		model.addAttribute("admin", admin);
		System.out.println(MedicalOffice.showAdmin());
		return "Admin";
	}
	
	@GetMapping("/addPatient")
	public String addPatient(ModelMap model)
	{
		Patient addPatient = new Patient();
		model.put("addPatient", addPatient);
		return "addNewPatient";
	}
	
	@PostMapping("/addPatient")
	public String viewPatient(@ModelAttribute("patient") Patient patient, BindingResult bindingResult, Map<String, Object> model) {
		System.out.println(patient);
		MedicalOffice.addPatient(patient);
		
		System.out.println("First Name: " + patient.getFirstName());
		System.out.println("Last Name: " + patient.getLastName());
		System.out.println("Date of Birth: " + patient.getDateOfBirth());
		System.out.println("patient ID: " + patient.getPatientID());
		
		//observer design pattern - notify observers of change
		MedicalOffice medicalOffice = MedicalOffice.getInstance("Boulder Health", new Address("123 Main Street", "Longmont", "Boulder", "Colorado", "80504"), "303-123-4567", "http://localhost:8080/SpringMVCTutorial/", new ArrayList<HealthcareProvider>(), new ArrayList<Admin>(), new ArrayList<Patient>());
		medicalOffice.setState("********Observer Update********\nNew patient added to the Healthcare Portal: " + patient.getFirstName() + " " + patient.getLastName() + ", id: " + patient.getPatientID());
						
		model.put("admin", CurrentAdmin.admin);
		
		return CurrentUser.userPage;
	}
	
//	@GetMapping("/adminSearchPatient")
//	public String searchPatient(ModelMap model)
//	{
//		Patient searchPatient = new Patient();
//		model.put("searchPatient", searchPatient);
//		return "searchPatient";
//	}
//	
//	@PostMapping("/adminSearchPatient")
//	public String viewSearchPatient(@ModelAttribute("patient") Patient patient, BindingResult bindingResult, Map<String, Object> model) {
//		System.out.println(patient);
//		
//		if (MedicalOffice.findPatient(patient.getFirstName(), patient.getLastName()) != null) {
//			CurrentPatient.patient = MedicalOffice.findPatient(patient.getFirstName(), patient.getLastName());
//		}
//		else {
//			CurrentPatient.patient = MedicalOffice.findPatient(patient.getPatientID());
//		}
//		System.out.println("First Name: " + CurrentPatient.patient.getFirstName());
//		System.out.println("Last Name: " + CurrentPatient.patient.getLastName());
//		System.out.println("Last Name: " + CurrentPatient.patient.getPatientID());
//		
//		model.put("patient", CurrentPatient.patient);
//		model.put("admin", CurrentAdmin.admin);
//		
//		return "Admin";
//	}
	
}