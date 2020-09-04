package com.demo.healthcareportal.service;

import java.util.List;

import com.demo.healthcareportal.model.Patient;


public interface PatientService {
	
	List<Patient> getAllPatients();
	
	void savePatient(Patient patient);
	
	Patient getPatientById(long case_id);
	
	void deleteEmployeeById(long case_id);
}
