package spring.controllers;

import java.util.Map;
//import java.util.List;
//import java.util.ArrayList;

import spring.model.BillingInformation;

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
		model.put("billingInformationForm", billingInformationForm);
		System.out.print("billing get:" + model);
		return "BillingInformation";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String processBillingInformation(@ModelAttribute("billingInformationForm") BillingInformation billingInformation, Map<String, Object> model) {
		//implement logic
		
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