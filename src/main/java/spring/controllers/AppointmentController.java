package spring.controllers;

import java.util.Map;
import java.util.List;
import java.util.ArrayList;

import spring.model.Appointment;
import spring.model.HealthcareProvider;

import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.ui.Model;
//import org.springframework.ui.ModelMap;

@Controller
//@RequestMapping(value="/appointment")
public class AppointmentController {
	
	@RequestMapping(value="/appointment", method = RequestMethod.GET)
	public String viewAppointment(Map<String, Object> model) {
//		change this to patient specific //https://www.codejava.net/frameworks/spring/spring-mvc-form-handling-tutorial-and-example
		Appointment appointmentForm = new Appointment();
		model.put("appointmentForm", appointmentForm);
		return "Appointment";
	}
	@RequestMapping(value = "/schedule", method = RequestMethod.GET)
	public String viewScheduleAppointment(Map<String, Object> model) {
		System.out.println("schedule appointment");
		Appointment appointmentForm = new Appointment();
		model.put("appointmentForm", appointmentForm);
		
		List<String> timesList = new ArrayList<String>();
		timesList.add("08:00-09:00");
		timesList.add("09:00-10:00");
		timesList.add("10:00-11:00");
		timesList.add("11:00-12:00");
		timesList.add("13:00-14:00");
		timesList.add("14:00-15:00");
		timesList.add("15:00-16:00");
		timesList.add("16:00-17:00");
		model.put("timesList", timesList);
		
		//CHANGE THIS TO ACTUAL HCP
//		List<HealthcareProvider> healthcareProvider = new ArrayList<HealthcareProvider>();
		List<String> healthcareProviderList = new ArrayList<String>();
		healthcareProviderList.add("Jakobi");
		healthcareProviderList.add("Moore");
		healthcareProviderList.add("Zulu");
		model.put("healthcareProviderList", healthcareProviderList);
		
		return "ScheduleAppointment";
	}
	@RequestMapping(value = "/cancel", method = RequestMethod.GET)
	public String viewCancelAppointment(Map<String, Object> model) {
		System.out.println("cancel appointment");
		Appointment appointmentForm = new Appointment();
		model.put("appointmentForm", appointmentForm);
			
		List<String> timesList = new ArrayList<String>();
		timesList.add("08:00-09:00");
		timesList.add("09:00-10:00");
		timesList.add("10:00-11:00");
		timesList.add("11:00-12:00");
		timesList.add("13:00-14:00");
		timesList.add("14:00-15:00");
		timesList.add("15:00-16:00");
		timesList.add("16:00-17:00");
		model.put("timesList", timesList);
		
		//CHANGE THIS TO ACTUAL HCP
//		List<HealthcareProvider> healthcareProvider = new ArrayList<HealthcareProvider>();
		List<String> healthcareProviderList = new ArrayList<String>();
		healthcareProviderList.add("Jakobi");
		healthcareProviderList.add("Moore");
		healthcareProviderList.add("Zulu");
		model.put("healthcareProviderList", healthcareProviderList);
		
		return "CancelAppointment";
	}
}