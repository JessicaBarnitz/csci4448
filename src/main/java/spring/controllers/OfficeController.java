package spring.controllers;

import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import spring.model.Address;
import spring.model.Admin;
import spring.model.CurrentAdmin;
import spring.model.CurrentPatient;
import spring.model.CurrentProvider;
import spring.model.CurrentUser;
import spring.model.HealthcareProvider;
import spring.model.MedicalOffice;
import spring.model.Patient;

import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;

@Controller
@RequestMapping(path="/")
public class OfficeController {
	
	@GetMapping("/healthcarePortal")
	public String newMedicalOffice(ModelMap model)
	{
		//using this as a test base to pre-populate the medical office with a few healthcare providers, admin and patients
		//new medical office
		MedicalOffice medicalOffice = MedicalOffice.getInstance("Boulder Health", new Address("123 Main Street", "Longmont", "Boulder", "Colorado", "80504"), "303-123-4567", "http://localhost:8080/SpringMVCTutorial/", new ArrayList<HealthcareProvider>(), new ArrayList<Admin>(), new ArrayList<Patient>());
		//new medical office healthcare providers
		//HealthcareProvider(String _username, String _password, String _firstName, String _lastName, Date _dateOfBirth, String _specialty)
		MedicalOffice.addHealthcareProvider(new HealthcareProvider("Naja", "!@as#$df1234", "Natalie", "Jakobi", new Date(8/28/1984), "general medicine"));
		MedicalOffice.addHealthcareProvider(new HealthcareProvider("Labu", "osjb^98y3qr", "Lark", "Bojangles", new Date(2/06/1981), "pulmonary"));
		MedicalOffice.addHealthcareProvider(new HealthcareProvider("Sera", "kjdbv^%*&jbf", "Seirra", "Rand", new Date(6/02/1970), "general medicine"));
		//new medical office admin
		//Admin(String _username, String _password, String _firstName, String _lastName, Date _dateOfBirth, String _jobTitle)
		MedicalOffice.addAdmin(new Admin("Maof", "sdfhab*&T2", "Maureen", "O'Fahlatery", new Date(3/7/1970), "manager"));
		
		Admin a = new Admin("Tita", "kajgb&^&426", "Tim", "Taylor", new Date(5/19/1990), "receptionist");
		MedicalOffice.addAdmin(a);
		medicalOffice.addObserver(a);
		
		//new medical office patient 
		//Patient(String _username, String _password, String _firstName, String _lastName, Date _dateOfBirth)
		MedicalOffice.addPatient(new Patient("Leba", "gjkbds&*56", "Lenora", "Babuska", new Date(5/19/1990)));
		MedicalOffice.addPatient(new Patient("Hado", "O*&*gv09", "Harry", "Doll", new Date(11/9/1980)));
		MedicalOffice.addPatient(new Patient("Tife", "&^vjh546", "Tigua", "Fealty", new Date(6/30/1972)));
		model.put("medicalOffice", medicalOffice);
		
		System.out.println(medicalOffice.getName());
		System.out.println(medicalOffice.getPhone());
		System.out.println(medicalOffice.showAddress());
		System.out.println(MedicalOffice.showHealthcareProviders());
		System.out.println(MedicalOffice.showAdmin());
		System.out.println(MedicalOffice.showPatients());
		
		return "HealthcarePortal";
	}
	
	@GetMapping("/HealthcarePortal")
	public String MedicalOffice(ModelMap model)
	{
		//get medical office instance
		MedicalOffice medicalOffice = MedicalOffice.getInstance("Boulder Health", new Address("123 Main Street", "Longmont", "Boulder", "Colorado", "80504"), "303-123-4567", "http://localhost:8080/SpringMVCTutorial/", new ArrayList<HealthcareProvider>(), new ArrayList<Admin>(), new ArrayList<Patient>());

		model.put("medicalOffice", medicalOffice);
		
		System.out.println(medicalOffice.getName());
		System.out.println(medicalOffice.getPhone());
		System.out.println(medicalOffice.showAddress());
		System.out.println(MedicalOffice.showHealthcareProviders());
		System.out.println(MedicalOffice.showAdmin());
		System.out.println(MedicalOffice.showPatients());
		
		return "HealthcarePortal";
	}
	
	@GetMapping("/medicalOffice")
	public String medicalOffice(ModelMap model)
	{
		//Singleton design pattern for medical office
		MedicalOffice medicalOffice = MedicalOffice.getInstance("Boulder Health", new Address("123 Main Street", "Longmont", "Boulder", "Colorado", "80504"), "303-123-4567", "http://localhost:8080/SpringMVCTutorial/", new ArrayList<HealthcareProvider>(), new ArrayList<Admin>(), new ArrayList<Patient>());
		model.put("medicalOffice", medicalOffice);
		System.out.println(medicalOffice.getName());
		System.out.println(medicalOffice.showAddress());
		System.out.println(MedicalOffice.showHealthcareProviders());
		System.out.println(MedicalOffice.showAdmin());
		System.out.println(MedicalOffice.showPatients());
		return "MedicalOffice";
	}
	
	@GetMapping("/searchPatient")
	public String searchPatient(ModelMap model)
	{
		Patient searchPatient = new Patient();
		model.put("searchPatient", searchPatient);
		return "searchPatient";
	}
	
	@PostMapping("/searchPatient")
	public String viewSearchPatient(@ModelAttribute("patient") Patient patient, BindingResult bindingResult, Map<String, Object> model) {
		System.out.println(patient);
		//implement logic
		if (MedicalOffice.findPatient(patient.getFirstName(), patient.getLastName()) != null) {
			CurrentPatient.patient = MedicalOffice.findPatient(patient.getFirstName(), patient.getLastName());
		}
		else {
			CurrentPatient.patient = MedicalOffice.findPatient(patient.getPatientID());
		}
		//observer design pattern - notify observers of change
		MedicalOffice medicalOffice = MedicalOffice.getInstance("Boulder Health", new Address("123 Main Street", "Longmont", "Boulder", "Colorado", "80504"), "303-123-4567", "http://localhost:8080/SpringMVCTutorial/", new ArrayList<HealthcareProvider>(), new ArrayList<Admin>(), new ArrayList<Patient>());
		medicalOffice.setState("");
				
		System.out.println("First Name: " + CurrentPatient.patient.getFirstName());
		System.out.println("Last Name: " + CurrentPatient.patient.getLastName());
		System.out.println("Last Name: " + CurrentPatient.patient.getPatientID());
		
		model.put("patient", CurrentPatient.patient);
		model.put("admin", CurrentAdmin.admin);
		model.put("provider", CurrentProvider.provider);

		return CurrentUser.userPage;
	}
}
