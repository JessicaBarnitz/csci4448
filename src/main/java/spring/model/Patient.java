package spring.model;

import java.util.*;

/**
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
    	this.patientID = 0;
    }
    /**
     * Overloaded constructor
     * @param String _username
     * @param String _password
     * @param String _firstName
     * @param String _lastName
     * @param Date _dateOfBirth
     * @param Int _patientID
     */
    public Patient(String _username, String _password, String _firstName, String _lastName, Date _dateOfBirth, int _patientID){
    	this.user = "patient";
    	this.username = _username; 
        this.password = _password;
        this.firstName = _firstName;
        this.lastName = _lastName;
        this.dateOfBirth = _dateOfBirth;
        this.patientID = _patientID;
    }
    /**
    * getter
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
    * @param int _patientID
    */
    public void setPatientID(int _patientID) {
        this.patientID = _patientID;
    }
    /**
     * login ensures that the username and password are correct
     * @param String _username
     * @param String _password
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