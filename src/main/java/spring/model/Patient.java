package spring.model;

import java.util.*;

/**
 * Patient class that serves as the central unit for the patient
 * 
 * @author Jessica Barnitz
 * @version 1.0
 * 
 */
public class Patient extends User{
	/**
     * A string describing the type of user
     */
	private String user;
	/**
     * The unique patient number
     */
	private int patientID;
	/**
     * Default constructor
     */
    public Patient() {
    	this.user = "patient";
    	this.patientID = MedicalOffice.getCurrentPatientID();
    	MedicalOffice.getNextPatientID();
    }
    /**
     * Overloaded constructor
     * 
     * @param _username user provided String username
     * @param _password user provided String password
     * @param _firstName user provided String first name
     * @param _lastName user provided String last name
     * @param _dateOfBirth user provided Date date of birth in form (mm/dd/yyyy)
     * @param _patientID assigned patient id by MedicalOffice
     */
    public Patient(String _username, String _password, String _firstName, String _lastName, Date _dateOfBirth){
    	this.user = "patient";
    	this.username = _username; 
        this.password = _password;
        this.firstName = _firstName;
        this.lastName = _lastName;
        this.dateOfBirth = _dateOfBirth;
        this.patientID = MedicalOffice.getNextPatientID();
        System.out.println(_firstName + patientID);
    }
    /**
    * getter for the type of user
    * @return this.user
    */
    public String getUser() {
        return this.user;
    }
    /**
    * getter
    * @return this.patientID
    */
    public int getPatientID() {
        return this.patientID;
    }
    /**
    * setter
    * @param _patientID 
    */
    public void setPatientID(int _patientID) {
        this.patientID = _patientID;
    }
    /**
     * login ensures that the username and password are correct
     * 
     * @param _username user provided String username
     * @param _password userprovided String password
     * @return this on success
     * @return null on failure
     */
   public Patient login(String _username, String _password) {
       if( (this.username == _username) && (this.password == _password) ) {
    	   return this;
       }
       else {
    	   return null;
       }
   }

}