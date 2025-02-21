package edu.ucalgary.oop;
import java.util.regex.*;

public class DisasterVictim {
	private String firstName;
	private String lastName;
	private String dateOfBirth;
	private int ASSIGNED_SOCIAL_ID;
	private FamilyRelation[] familyConnections;
	private MedicalRecord[] medicalRecords;
	private Supply[] personalBelongings;
	private String ENTRY_DATE;
	private String gender;
	private String comments;
	private static int counter = 0;
	
	public DisasterVictim(String firstName, String ENTRY_DATE) throws IllegalArgumentException {
		this.setFirstName(firstName);
		this.ENTRY_DATE = ENTRY_DATE;
	}
	
	public DisasterVictim(String firstName, String ENTRY_DATE, String dateOfBirth) {
		this.setFirstName(firstName);
		this.ENTRY_DATE = ENTRY_DATE;
		this.setDateOfBirth(dateOfBirth); //uses DOB setter to check for proper format
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) throws IllegalArgumentException {
		//Date format should be in YYYY-MM-DD format, throws exception otherwise
		if (isValidDateFormat(dateOfBirth)) {
			this.dateOfBirth = dateOfBirth;
		} else {
			throw new IllegalArgumentException("Invalid date format (must be YYYY-MM-DD)");
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
