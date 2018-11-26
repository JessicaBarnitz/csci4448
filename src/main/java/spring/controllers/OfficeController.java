package spring.controllers;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import spring.model.Address;
import spring.model.Admin;
import spring.model.HealthcareProvider;
import spring.model.MedicalOffice;
import spring.model.Patient;

import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;

@Controller
@RequestMapping(path="/")
public class OfficeController {
	@GetMapping("/medicalOffice")
	public String medicalOffice(ModelMap model)
	{
		//main logic of medical office
		MedicalOffice medicalOffice = new MedicalOffice("Boulder Health", new Address("123 Main Street", "Longmont", "Boulder", "Colorado", "80504"), "303-123-4567", "http://localhost:8080/SpringMVCTutorial/", new ArrayList<HealthcareProvider>(), new ArrayList<Admin>(), new ArrayList<Patient>());
        //add some hcps
		MedicalOffice.addHealthcareProvider(new HealthcareProvider("Naja", "!@as#$df1234", "Natalie", "Jakobi", new Date(8/28/1984), "general medicine"));
		MedicalOffice.addHealthcareProvider(new HealthcareProvider("Labu", "osjb^98y3qr", "Lark", "Bojangles", new Date(2/06/1981), "pulmonary"));
		MedicalOffice.addHealthcareProvider(new HealthcareProvider("Sera", "kjdbv^%*&jbf", "Seirra", "Rand", new Date(8/28/1984), "general medicine"));
		
        
		model.put("medicalOffice", medicalOffice);
		System.out.println(medicalOffice.getName());
		System.out.println(medicalOffice.showAddress());
		System.out.println(medicalOffice.showHealthcareProviders());
		return "MedicalOffice";
	}

	

}
