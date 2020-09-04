package com.demo.healthcareportal.web.dto;

public class PatientRegistrationDto {

	private String patientFirstName;
	private String patientLastName;
	private String address;
	private String emergName;
	private String emergencyNumber;
	private int dateAdmitted;
	private String notes;
	private String prescrips;

	public PatientRegistrationDto(String patientFirstName, String patientLastName, String address, String emergName,
			String emergencyNumber, int dateAdmitted, String notes, String prescrips) {
		super();
		this.patientFirstName = patientFirstName;
		this.patientLastName = patientLastName;
		this.address = address;
		this.emergName = emergName;
		this.emergencyNumber = emergencyNumber;
		this.dateAdmitted = dateAdmitted;
		this.notes = notes;
		this.prescrips = prescrips;
	}
	
	
	public String getPatientFirstName() {
		return patientFirstName;
	}
	public void setPatientFirstName(String patientFirstName) {
		this.patientFirstName = patientFirstName;
	}
	public String getPatientLastName() {
		return patientLastName;
	}
	public void setPatientLastName(String patientLastName) {
		this.patientLastName = patientLastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmergName() {
		return emergName;
	}
	public void setEmergName(String emergName) {
		this.emergName = emergName;
	}
	public String getEmergencyNumber() {
		return emergencyNumber;
	}
	public void setEmergencyNumber(String emergencyNumber) {
		this.emergencyNumber = emergencyNumber;
	}
	public int getDateAdmitted() {
		return dateAdmitted;
	}
	public void setDateAdmitted(int dateAdmitted) {
		this.dateAdmitted = dateAdmitted;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public String getPrescrips() {
		return prescrips;
	}
	public void setPrescrips(String prescrips) {
		this.prescrips = prescrips;
	}
}
