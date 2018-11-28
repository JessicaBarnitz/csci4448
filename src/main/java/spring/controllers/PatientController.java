package spring.controllers;

import spring.model.Appointment;
import spring.model.CurrentPatient;
import spring.model.MedicalOffice;
import spring.model.Patient;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;


@Controller
@SessionAttributes("patient")
@RequestMapping(value="/")
public class PatientController {
	
	@GetMapping("/patient")
	public String patient(ModelMap model)
	{
		model.addAttribute("firstName", "patientName"); //default attributes
		model.addAttribute("user", "patient"); //default attributes
		
		Patient patient = new Patient();
		model.put("patient", patient);
//		model.put("healthcareProviderList", MedicalOffice.getAllHealthcareProviders());
		return "welcomePatient";
	}
	
//	@RequestMapping(value = "/schedule", method = RequestMethod.POST)
//	public String processScheduleAppointment(@ModelAttribute("appointment") Appointment appoint, BindingResult bindingResult, Map<String, Object> model) {
//		//implement logic
//		
//		//testing purposes
//		System.out.println("appointment post:" + model);
//		System.out.println("Appointment time: " + appoint.getTime());
//		System.out.println("Appointment day: " + appoint.getDate());
//		System.out.println("Appointment reason: " + appoint.getReason());
//		System.out.println("Appointment hcp: " + appoint.getHealthcareProviderStr());
//		System.out.println("Appointment patient: " + appoint.getPatient());
//		
//		return "ScheduleAppointmentSuccess";
//	}
	
	@PostMapping("/patient")
	public String viewPatient(@ModelAttribute("patient") Patient patient) {
		System.out.println(patient);
		MedicalOffice.addPatient(patient);
		CurrentPatient.patient = patient;
		
		System.out.println("First Name: " + patient.getFirstName());
		System.out.println("Last Name: " + patient.getLastName());
		System.out.println("Date of Birth: " + patient.getDateOfBirth());
		System.out.println("patient ID: " + patient.getPatientID());
		
		return "Patient";
	}
}