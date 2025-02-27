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

    private static final String DATE_PATTERN = "\\d{4}-\\d{2}-\\d{2}";

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

    public DisasterVictim getMissingPerson() {
        return missingPerson;
    }

    public String getDateOfInquiry() {
        return dateOfInquiry;
    }

    // helper function
    public void setDateOfInquiry(String dateOfInquiry) {
        if (!Pattern.matches(DATE_PATTERN, dateOfInquiry)) {
            throw new IllegalArgumentException("Invalid date format. Expected format: YYYY-MM-DD");
        }
        this.dateOfInquiry = dateOfInquiry;
    }

    public String getInfoProvided() {
        return infoProvided;
    }

    public Location getLastKnownLocation() {
        return lastKnownLocation;
    }

    public String getLogDetails() {
        return "Inquirer: " + inquirer.getFirstName() + ", Missing Person: "
                + missingPerson.getFirstName() + ", Date of Inquiry: " + dateOfInquiry + ", Info Provided: "
                + infoProvided + ", Last Known Location: " + lastKnownLocation.getName();
    }
}
