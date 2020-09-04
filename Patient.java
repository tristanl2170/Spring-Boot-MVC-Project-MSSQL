package com.demo.healthcareportal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "patients")
public class Patient {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long case_id;
	
	@Column(name = "patient_first_name")
	private String patient_first_name;
	
	@Column(name = "patient_last_name")
	private String patient_last_name;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "emerg_name")
	private String emerg_name;
	
	@Column(name  = "emerg_number")
	private String emerg_number;
	
	@Column(name = "date_admitted")
	private String date_admitted;
	
	@Column(name = "prescrips")
	private String prescrips;
	
	
	public long getCase_id() {
		return case_id;
	}

	public void setCase_id(long case_id) {
		this.case_id = case_id;
	}

	public String getPatient_first_name() {
		return patient_first_name;
	}

	public void setPatient_first_name(String patient_first_name) {
		this.patient_first_name = patient_first_name;
	}

	public String getPatient_last_name() {
		return patient_last_name;
	}

	public void setPatient_last_name(String patient_last_name) {
		this.patient_last_name = patient_last_name;
	}


	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
	public String getEmerg_name() {
		return emerg_name;
	}

	public void setEmerg_name(String emerg_name) {
		this.emerg_name = emerg_name;
	}

	public String getEmerg_number() {
		return emerg_number;
	}

	public void setEmerg_number(String emerg_number) {
		this.emerg_number = emerg_number;
	}

	public String getDate_admitted() {
		return date_admitted;
	}

	public void setDate_admitted(String date_admitted) {
		this.date_admitted = date_admitted;
	}

	public String getPrescrips() {
		return prescrips;
	}

	public void setPrescrips(String prescrips) {
		this.prescrips = prescrips;
	}

}
