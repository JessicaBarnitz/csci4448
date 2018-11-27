package spring.controllers;

import java.util.Map;
import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;

import spring.model.Appointment;
import spring.model.HealthcareProvider;
import spring.model.MedicalOffice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AppointmentController {
	
	@RequestMapping(value="/appointment", method = RequestMethod.GET)
	public String viewAppointment(Map<String, Object> model) {
		Appointment appointment = new Appointment();
		
		model.put("appointment", appointment);
		
		return "Appointment";
	}
	
	@RequestMapping(value = "/schedule", method = RequestMethod.GET)
	public String viewScheduleAppointment(Map<String, Object> model) {
		System.out.println("schedule appointment");
		Appointment appointment = new Appointment();
		
		model.put("appointment", appointment);
		model.put("timesList", appointment.getAllAppointmentTimes());
		model.put("healthcareProviderList", appointment.getAllHealthcareProviders());
		
		return "ScheduleAppointment";
	}
	
	@RequestMapping(value = "/cancel", method = RequestMethod.GET)
	public String viewCancelAppointment(Map<String, Object> model) {
		System.out.println("cancel appointment");
		Appointment appointment = new Appointment();
		
		model.put("appointment", appointment);
		model.put("timesList", appointment.getAllAppointmentTimes());
		model.put("healthcareProviderList", appointment.getAllHealthcareProviders());
		
		return "CancelAppointment";
	}
}