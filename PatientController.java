package com.demo.healthcareportal.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.demo.healthcareportal.model.Patient;
import com.demo.healthcareportal.service.PatientService;

@Controller
public class PatientController {
	
	@Autowired
	private PatientService patientService;
	
	@GetMapping("/")
	public String viewHomePage(Model model)
	{
		model.addAttribute("listPatients", patientService.getAllPatients());
		return "index";
	}
	
	@GetMapping("/showNewPatientForm")
	public String showNewPatientForm(Model model)
	{
		//create model to bind form data
		Patient patient = new Patient();
		model.addAttribute("patient", patient);
		return "new_patient";
		
//		model.addAttribute("Patient", new Patient());
		
	}
	
	@PostMapping("/savePatient")
	public String savePatient(@ModelAttribute("patient") Patient patient )
	{
		//save patient to database
		patientService.savePatient(patient);
		return "redirect:/";
		
	}
	
	@GetMapping("/showFormForUpdate/{case_id}")
	public String showFormForUpdate(@PathVariable (value="case_id") long case_id, Model model)
	{
		//get patient from the service
		Patient patient = patientService.getPatientById(case_id);
		
		//set patient as a model attribute to pre-populate the form
		model.addAttribute("patient", patient);
		return "update_patient";
	}
	
	@GetMapping("/deleteEmployee/{case_id}")
	public String deleteEmployee(@PathVariable (value="case_id") long case_id )
	{
		//call delete employee method
		this.patientService.deleteEmployeeById(case_id);
		return "redirect:/";
	}
}
