package spring.controllers;

import spring.model.User;
import spring.model.Address;
import spring.model.Admin;
import spring.model.BillingInformation;
import spring.model.CurrentAdmin;
import spring.model.CurrentPatient;
import spring.model.MedicalOffice;
import spring.model.Patient;

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
		model.put("admin", admin);
		return "welcomeAdmin";
	}
	
	@PostMapping("/admin")
	public String viewPatient(@ModelAttribute("admin") Admin admin, ModelMap model, HttpSession session) {
		System.out.println(admin);
		MedicalOffice.addAdmin(admin);
		CurrentAdmin.admin = admin;
		
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
		model.put("admin", CurrentAdmin.admin);
		
		return "Admin";
	}
}