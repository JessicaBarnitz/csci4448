package spring.model;

import java.util.*;

/**
 * 
 */
public class Patient extends User{
	private String user;
	private int patientID;

	/**
     * Default constructor
     */
    public Patient() {
    	this.user = "patient";
    	this.patientID = 0;
    }
    /**
    * @return this.user
    */
    public String getUser() {
        return this.user;
    }
    /**
    * @return this.patientID
    */
    public int getPatientID() {
        return this.patientID;
    }
    /**
    * @param int _patientID
    */
    public void setPatientID(int _patientID) {
        this.patientID = _patientID;
    }
   /**
    * @param String _username
    * @param String _password
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