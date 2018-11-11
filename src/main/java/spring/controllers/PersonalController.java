package spring.controllers;

import java.util.Map;
//import java.util.List;
//import java.util.ArrayList;

import spring.model.PersonalInformation;

import org.springframework.stereotype.Controller;
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
}