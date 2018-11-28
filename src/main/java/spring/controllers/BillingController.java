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
import spring.model.MedicalOffice;
import spring.model.Patient;

import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.ui.Model;
//import org.springframework.ui.ModelMap;

@Controller
@RequestMapping(value="/billing")
public class BillingController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String viewBillingInformation(Map<String, Object> model) {
//		change this to patient specific //https://www.codejava.net/frameworks/spring/spring-mvc-form-handling-tutorial-and-example
		BillingInformation billingInformationForm = new BillingInformation();
		Address address = new Address();
		billingInformationForm.setBillingAddress(address);
		
		model.put("billingInformationForm", billingInformationForm);
		model.put("patient", CurrentPatient.patient);
		model.put("admin", CurrentAdmin.admin);
		model.put("provider", CurrentProvider.provider);
		
		System.out.println("billing get:" + model);
		return "BillingInformation";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String processBillingInformation(@ModelAttribute("billingInformationForm") BillingInformation billingInformation, Map<String, Object> model) {
		//implement logic
		Patient patient = CurrentPatient.patient;
		CurrentPatient.patient.setBillingInformation(billingInformation);
		model.put("patient", CurrentPatient.patient);
		model.put("admin", CurrentAdmin.admin);
		model.put("provider", CurrentProvider.provider);
		
		//observer design pattern - notify observers of change
		MedicalOffice medicalOffice = MedicalOffice.getInstance("Boulder Health", new Address("123 Main Street", "Longmont", "Boulder", "Colorado", "80504"), "303-123-4567", "http://localhost:8080/SpringMVCTutorial/", new ArrayList<HealthcareProvider>(), new ArrayList<Admin>(), new ArrayList<Patient>());
		medicalOffice.setState("********Observer Update********\nBilling Information Updated for Patient: " + patient.getFirstName() + " " + patient.getLastName() + ", id: " + patient.getPatientID());
				
		//testing purposes
		System.out.println("billing post:" + model);
		System.out.println("Insurance Plan? " + billingInformation.getInsurance());
		System.out.println("Insurance Plan: " + billingInformation.getInsurancePlan());
		System.out.println("Insurance Plan Number: " + billingInformation.getInsurancePlanNumber());
		System.out.println("Insurance Effective Date: " + billingInformation.getEffectiveDate ());
		System.out.println("Insurance Copay: " + billingInformation.getCopay());
		System.out.println("Insurance Billing Address: " + billingInformation.getBillingAddress());
		
		return "BillingInformationSuccess";
	}
}