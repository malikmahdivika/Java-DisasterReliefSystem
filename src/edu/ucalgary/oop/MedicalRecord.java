package edu.ucalgary.oop;

import java.util.regex.*;

public class MedicalRecord {
	private Location location;
	private String treatmentDetails;
	private String dateOfTreatment;
	
	public MedicalRecord(Location location, String treatmentDetails,
			String dateOfTreatment) throws IllegalArgumentException {
		this.setLocation(location);
		this.setTreatmentDetails(treatmentDetails);
		this.setDateOfTreatment(dateOfTreatment);
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public String getTreatmentDetails() {
		return treatmentDetails;
	}

	public void setTreatmentDetails(String treatmentDetails) {
		this.treatmentDetails = treatmentDetails;
	}
	
	public String getDateOfTreatment() {
		return dateOfTreatment;
	}

	public void setDateOfTreatment(String dateOfTreatment) throws IllegalArgumentException {
		if (isValidDateFormat(dateOfTreatment)) {
			this.dateOfTreatment = dateOfTreatment;
		} else {
			throw new IllegalArgumentException("Date must be in format YYYY-MM-DD");
		}
	}
	
	private static boolean isValidDateFormat(String date) {
		Pattern dateRegex = Pattern.compile("^\\d{4}-\\d{2}-\\d{2}");
		Matcher dateMatcher = dateRegex.matcher(date);
		
		if (dateMatcher.matches()) {
			return true;
		} else {
			return false;
		}
	}
}
