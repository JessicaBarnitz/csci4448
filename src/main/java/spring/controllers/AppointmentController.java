package spring.controllers;

import java.util.Map;
import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;

import spring.model.Appointment;
import spring.model.CurrentPatient;
import spring.model.HealthcareProvider;
import spring.model.MedicalOffice;
import spring.model.Patient;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AppointmentController {
	
	@RequestMapping(value = "/schedule", method = RequestMethod.GET)
	public String viewScheduleAppointment(Map<String, Object> model) {
		System.out.println("schedule appointment");
		Appointment appointment = new Appointment();
		
		model.put("appointment", appointment);
		model.put("timesList", appointment.getAllAppointmentTimes());
		model.put("healthcareProviderList", appointment.getAllHealthcareProviders());
		model.put("patient", CurrentPatient.patient);
		
		System.out.println("in controller:" + CurrentPatient.patient);
		
		return "ScheduleAppointment";
	}
	
	@RequestMapping(value = "/schedule", method = RequestMethod.POST)
	public String processScheduleAppointment(@ModelAttribute("appointment") Appointment appointment, BindingResult bindingResult, Map<String, Object> model) {
		//implement logic
		appointment.setPatient(CurrentPatient.patient);
		//testing purposes
		System.out.println("appointment post:" + model);
		System.out.println("Appointment time: " + appointment.getTime());
		System.out.println("Appointment day: " + appointment.getDate());
		System.out.println("Appointment reason: " + appointment.getReason());
		System.out.println("Appointment hcp: " + appointment.getHealthcareProviderStr());
		System.out.println("Appointment patient: " + appointment.getPatient().getFirstName());
		
		appointment.setHealthcareProvider(MedicalOffice.findHealthcareProvider(appointment.getHealthcareProviderStr()));
		CurrentPatient.patient.addAppointment(appointment);
		model.put("provider", MedicalOffice.findHealthcareProvider(appointment.getHealthcareProviderStr()));
		model.put("patient", CurrentPatient.patient);
		
		return "Patient";
	}
	@RequestMapping(value = "/cancel", method = RequestMethod.GET)
	public String viewCancelAppointment(Map<String, Object> model) {
		System.out.println("cancel appointment");
		Appointment appointment = new Appointment();
		
		model.put("appointment", appointment);
		model.put("timesList", appointment.getAllAppointmentTimes());
		model.put("healthcareProviderList", appointment.getAllHealthcareProviders());
		model.put("patient", CurrentPatient.patient);
		
		return "CancelAppointment";
	}
	
	@RequestMapping(value = "/cancel", method = RequestMethod.POST)
	public String processCancelAppointment(@ModelAttribute("appointment") Appointment appointment, BindingResult bindingResult, Map<String, Object> model) {
		//implement logic
		appointment.setPatient(CurrentPatient.patient);
		//testing purposes
		System.out.println("appointment post:" + model);
		System.out.println("Appointment time: " + appointment.getTime());
		System.out.println("Appointment day: " + appointment.getDate());
		System.out.println("Appointment reason: " + appointment.getReason());
		System.out.println("Appointment hcp: " + appointment.getHealthcareProviderStr());
		System.out.println("Appointment patient: " + appointment.getPatient().getFirstName());
		
		CurrentPatient.patient.cancelAppointment(appointment.getDate(), appointment.getTime());
		model.put("patient", CurrentPatient.patient);
		
		return "Patient";
	}
}