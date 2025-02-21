package edu.ucalgary.oop;
import java.util.regex.*;

public class DisasterVictim {
	private String firstName;
	private String lastName;
	private String dateOfBirth;
	private int ASSIGNED_SOCIAL_ID = -1;
	/*ID will never be negative, this tells the program that the victim has not generated
	an assigned social ID yet.*/
	
	private FamilyRelation[] familyConnections;
	private MedicalRecord[] medicalRecords;
	private Supply[] personalBelongings;
	private String ENTRY_DATE;
	private String gender;
	private String comments;
	private static int counter = 0;
	
	public DisasterVictim(String firstName, String ENTRY_DATE) throws IllegalArgumentException {
		this.setFirstName(firstName);
		
		if (isValidDateFormat(ENTRY_DATE)) {
			this.ENTRY_DATE = ENTRY_DATE;
		} else {
			throw new IllegalArgumentException("Date must be in format YYYY-MM-DD");
		}
	}
	
	public DisasterVictim(String firstName, String ENTRY_DATE, String dateOfBirth) throws IllegalArgumentException{
		this.setFirstName(firstName);
		
		if (isValidDateFormat(ENTRY_DATE)) {
			this.ENTRY_DATE = ENTRY_DATE;
		} else {
			throw new IllegalArgumentException("Date must be in format YYYY-MM-DD");
		}
		
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
	
	public String getEntryDate() {
		return this.ENTRY_DATE;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setDateOfBirth(String dateOfBirth) throws IllegalArgumentException {
		//Date format should be in YYYY-MM-DD format, throws exception otherwise
		if (isValidDateFormat(dateOfBirth)) {
			this.dateOfBirth = dateOfBirth;
		} else {
			throw new IllegalArgumentException("Invalid date format (must be YYYY-MM-DD)");
		}
	}
	
	public int getAssignedSocialID() {
		if (this.ASSIGNED_SOCIAL_ID == -1) {
			this.ASSIGNED_SOCIAL_ID = generateSocialID();
			return this.ASSIGNED_SOCIAL_ID;
		} else {
			return this.ASSIGNED_SOCIAL_ID;
		}
	}
	
	public FamilyRelation[] getFamilyConnections() {
		return familyConnections;
	}

	public void setFamilyConnections(FamilyRelation[] familyConnections) {
		this.familyConnections = familyConnections;
	}

	public MedicalRecord[] getMedicalRecords() {
		return medicalRecords;
	}

	public void setMedicalRecords(MedicalRecord[] medicalRecords) {
		this.medicalRecords = medicalRecords;
	}

	public Supply[] getPersonalBelongings() {
		return personalBelongings;
	}

	public void setPersonalBelongings(Supply[] personalBelongings) {
		this.personalBelongings = personalBelongings;
	}
	
	public void addPersonalBelonging(Supply supply) {
		//fix later: null pointer exception when this.personalBelongings is null
		Supply[] newPersonalBelongings = new Supply[this.personalBelongings.length + 1];
		
		int i = 0;
		for (Supply belonging : this.personalBelongings) {
			newPersonalBelongings[i] = belonging;
			i++;
		}
		
		this.personalBelongings = newPersonalBelongings;
	}
	
	public void removePersonalBelonging(Supply unwantedSupply) {
		//TODO implement method
	}
	
	public void addFamilyConnection(FamilyRelation record) {
		//TODO implement method
	}
	
	public void removeFamilyConnection(FamilyRelation exRelation) {
		//TODO implement method
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
	
	private static int generateSocialID() {
		DisasterVictim.counter++;
		return DisasterVictim.counter;
	}
}
