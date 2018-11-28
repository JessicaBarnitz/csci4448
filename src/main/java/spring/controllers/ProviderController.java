package spring.controllers;

import spring.model.CurrentAdmin;
import spring.model.CurrentPatient;
import spring.model.CurrentProvider;
import spring.model.CurrentUser;
import spring.model.HealthcareProvider;
import spring.model.MedicalOffice;
import spring.model.Patient;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;


@Controller
@RequestMapping(value="/")
public class ProviderController {
	
	@GetMapping("/newProvider")
	public String provider(ModelMap model)
	{
		HealthcareProvider provider = new HealthcareProvider();
		CurrentAdmin.admin = null;
		CurrentPatient.patient = null;
		model.put("provider", provider);
		return "welcomeProvider";
	}
	
	@PostMapping("/provider")
	public String viewProvider(@ModelAttribute("provider") HealthcareProvider provider, ModelMap model, HttpSession session) {
		System.out.println(provider);
		
		MedicalOffice.addHealthcareProvider(provider);
		CurrentProvider.provider = provider;
		CurrentUser.userPage = "Provider";
		
		System.out.println("First Name: " + provider.getFirstName());
		System.out.println("Last Name: " + provider.getLastName());
		System.out.println("Date of Birth: " + provider.getDateOfBirth());
		System.out.println(MedicalOffice.showHealthcareProviders());
		
		model.put("Provider", CurrentProvider.provider);
		return "Provider";
	}
	
	@GetMapping("/providerSearchPatient")
	public String searchPatient(ModelMap model)
	{
		Patient searchPatient = new Patient();
		model.put("searchPatient", searchPatient);
		return "searchPatient";
	}
	
	@PostMapping("/providerSearchPatient")
	public String viewSearchPatient(@ModelAttribute("patient") Patient patient, BindingResult bindingResult, Map<String, Object> model) {
		System.out.println(patient);
		
		if (MedicalOffice.findPatient(patient.getFirstName(), patient.getLastName()) != null) {
			CurrentPatient.patient = MedicalOffice.findPatient(patient.getFirstName(), patient.getLastName());
		}
		else {
			CurrentPatient.patient = MedicalOffice.findPatient(patient.getPatientID());
		}
		System.out.println("First Name: " + CurrentPatient.patient.getFirstName());
		System.out.println("Last Name: " + CurrentPatient.patient.getLastName());
		System.out.println("Last Name: " + CurrentPatient.patient.getPatientID());
		
		model.put("patient", CurrentPatient.patient);
		model.put("Provider", CurrentProvider.provider);
		
		return "Provider";
	}
}