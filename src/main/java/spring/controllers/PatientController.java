package spring.controllers;

import spring.model.User;
import spring.model.Patient;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;


@Controller
//@RequestMapping(value="/patient/new/")
public class PatientController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String viewPatient(Map<String, Object> model) {
//		change this to patient specific //https://www.codejava.net/frameworks/spring/spring-mvc-form-handling-tutorial-and-example
		Patient patient = new Patient();
		model.put("patient", patient);
		return "Patient";
	}
	
//	@RequestMapping(method = RequestMethod.POST)
//	public String processBillingInformation(@ModelAttribute("billingInformationForm") BillingInformation billingInformation, Map<String, Object> model) {
//		//implement logic
//		
//		//testing purposes
//		System.out.println("Insurance Plan? " + billingInformation.getInsurance());
//		System.out.println("Insurance Plan: " + billingInformation.getInsurancePlan());
//		System.out.println("Insurance Plan Number: " + billingInformation.getInsurancePlanNumber());
//		System.out.println("Insurance Effective Date: " + billingInformation.getEffectiveDate ());
//		System.out.println("Insurance Copay: " + billingInformation.getCopay());
//		System.out.println("Insurance Billing Address: " + billingInformation.getBillingAddress());
//		return "BillingInformationSuccess";
//	}
}