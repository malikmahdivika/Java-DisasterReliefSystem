package edu.ucalgary.oop;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.regex.Pattern;

public class ReliefService {

    private Inquirer inquirer;
    private DisasterVictim missingPerson;
    private String dateOfInquiry;
    private String infoProvided;
    private Location lastKnownLocation;

    private static final String DATE_PATTERN = "^\\d{4}-\\d{2}-\\d{2}$";

    public ReliefService(Inquirer inquirer, DisasterVictim missingPerson, String dateOfInquiry, String infoProvided, Location lastKnownLocation) {
        this.inquirer = inquirer;
        this.missingPerson = missingPerson;
        setDateOfInquiry(dateOfInquiry);
        this.infoProvided = infoProvided;
        this.lastKnownLocation = lastKnownLocation;
    }

    public Inquirer getInquirer() {
        return inquirer;
    }

    public void setInquirer(Inquirer inquirer) {
		this.inquirer = inquirer;
	}

    public DisasterVictim getMissingPerson() {
        return missingPerson;
    }

    public void setMissingPerson(DisasterVictim missingPerson) {
		this.missingPerson = missingPerson;
	}

    public String getDateOfInquiry() {
        return dateOfInquiry;
    }

    // helper function
    public void setDateOfInquiry(String dateOfInquiry) throws IllegalArgumentException {
		boolean checkDate = isValidDateFormat(dateOfInquiry);
		if(checkDate == false) {
			throw new IllegalArgumentException("Invalid date format!");
		}
		else {
			this.dateOfInquiry = dateOfInquiry;
		}
	}

    public String getInfoProvided() {
        return infoProvided;
    }

    public Location getLastKnownLocation() {
        return lastKnownLocation;
    }

    private boolean isValidDateFormat(String date) {
		Pattern dateFormat = Pattern.compile(DATE_PATTERN);
		Matcher myMatcher = dateFormat.matcher(date);
		
		if(myMatcher.find()) {
			String month = date.substring(5,7);
			String day = date.substring(8, 10);
			if(Integer.parseInt(month) > 12 || Integer.parseInt(month) < 0) {
				return false;
			}
			else if(Integer.parseInt(day) > 31 || Integer.parseInt(day) < 0) {
				return false;
			}
			else {
				return true;
			}
		}
		return true;
	}

    public String getLogDetails() {
        return "Inquirer: " + inquirer.getFirstName() + ", Missing Person: "
                + missingPerson.getFirstName() + ", Date of Inquiry: " + dateOfInquiry + ", Info Provided: "
                + infoProvided + ", Last Known Location: " + lastKnownLocation.getName();
    }
}
