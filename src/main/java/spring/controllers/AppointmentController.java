package spring.controllers;

import java.util.Map;
//import java.util.List;
//import java.util.ArrayList;

import spring.model.Appointment;

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
//		change this to patient specific //https://www.codejava.net/frameworks/spring/spring-mvc-form-handling-tutorial-and-example
//		Appointment appointmentForm = new Appointment();
//		model.put("appointmentForm", appointmentForm);
		System.out.println("schedule appointment");
		return "ScheduleAppointment";
	}
	@RequestMapping(value = "/cancel", method = RequestMethod.GET)
	public String viewCancelAppointment(Map<String, Object> model) {
//		change this to patient specific //https://www.codejava.net/frameworks/spring/spring-mvc-form-handling-tutorial-and-example
//		Appointment appointmentForm = new Appointment();
//		model.put("appointmentForm", appointmentForm);
		System.out.println("cancel appointment");
		return "CancelAppointment";
	}
}