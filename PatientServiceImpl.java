package com.demo.healthcareportal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.healthcareportal.model.Patient;
import com.demo.healthcareportal.repository.PatientRepository;

@Service
public class PatientServiceImpl implements PatientService {

	@Autowired
	private PatientRepository patientRepo;
	
	@Override
	public List<Patient> getAllPatients()
	{
		return patientRepo.findAll();
	}

	@Override
	public void savePatient(Patient patient) {
		
		this.patientRepo.save(patient);
		
	}

	@Override
	public Patient getPatientById(long case_id) 
	{
		Optional<Patient> optional = patientRepo.findById(case_id);
		Patient patient = null;
		
		if(optional.isPresent())
		{
			patient = optional.get();
		}
		else
		{
			throw new RuntimeException("Patient Not Found for id::" + case_id);
		}
		
		return patient;
	}

	@Override
	public void deleteEmployeeById(long case_id) {
		this.patientRepo.deleteById(case_id);
		
	}
	
	
	
}
