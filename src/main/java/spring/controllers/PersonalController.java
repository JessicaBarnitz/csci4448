package spring.controllers;

import java.util.Map;
//import java.util.List;
//import java.util.ArrayList;

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
		model.put("personalInformationForm", personalInformationForm);
		return "PersonalInformation";
	}
	@RequestMapping(method = RequestMethod.POST)
	public String processPersonalInformation(@ModelAttribute("personalInformationForm") PersonalInformation personalInformation, Map<String, Object> model) {
		//implement logic
		//implement logic
		
		//testing purposes
//		System.out.println("First Name: " + personalInformation.getFirstName());
//		System.out.println("Last Name: " + personalInformation.getLastName());
//		System.out.println("Date of Birth: " + personalInformation.getDateOfBirth());
		System.out.println("Contact Phone: " + personalInformation.getPhone());
		System.out.println("Contact Email: " + personalInformation.getEmail());
		System.out.println("Home Address: " + personalInformation.getHomeAddress());
		System.out.println("Emergency Contact Phone: " + personalInformation.getEmergencyContactPhone());
		System.out.println("Emergency Contact Name: " + personalInformation.getEmergencyContactName());
		return "PersonalInformationSuccess";
	}
}